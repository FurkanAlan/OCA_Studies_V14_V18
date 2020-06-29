package OCA_Hepsi.V14.Q_1_60.Q19.p1;

public class Acc {
    int p;          //not visible outside of the package
    private int q;  //only visible within the class
    protected int r; // bu sarti saglamak icin child class in objesi yazilmali ve bu takdirde protected e
    // ulasabiliyoruz lakin yine de int p, default ulasilamiyor
    public int s;   // visible in universe
}
