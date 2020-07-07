package OCA_Hepsi.V18.OCA223_Q204_223.Q208;

class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}

public class TestCall { //private diger class dan metodla cagirilamiyor metodlari private oldug icin ulasilamiyor,
    // protected, default yada public olsa sorun yok
    public static void main(String[] args) {
        Caller c = new Caller();
//        c.start(); //line 1
//        c.init(); //line 2
    }
}
/*
Whats the result?
A. Compilation fails at line n1.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails at line n2.
Answer: D   ama ikiside fail hata veriyo
 */
