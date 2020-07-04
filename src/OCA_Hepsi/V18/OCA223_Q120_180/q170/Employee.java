package OCA_Hepsi.V18.OCA223_Q120_180.q170;

public class Employee {

//    public int doCalc() {
//        return 5;
//    }


    public int salary;
}

class Manager extends Employee {
    public int budget;


}

class Director extends Manager {
    public int stockOptions;


    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
//        Employee director2 = new Director(); //eger bu skilde bir cast yapilirsa ClassCastExeption a sebep
        // oluyor cunku Employee Parent ve biz bunu child ile baglamaya calisiyoruz, eger su skilde yapsak yine
        // hata verecek Employee director2 = (Director) new Employee(); bunu ancak su sekilde objesini
        // olusturabiliriz Employee director2 = new Director(); boyle yaptigimiz zaman director2 bir Employee objesi
        // ve referens ettigi nokta Director oluyor, bu sekilde yaptigimiz zaman bize ulastiracagi metod ve field
        // lar, sirasiyla doCalc metodu ve salary instance variable olacak yani biz bu sekilde Director un icerisindeki
        // metodlara yada field a ulasamiyoruz, ulasabilmek icin kendi objesini yazmamiz gerekli,
        // Director director = new Director();
        //line n1
    }

}


//Answer--> CE

