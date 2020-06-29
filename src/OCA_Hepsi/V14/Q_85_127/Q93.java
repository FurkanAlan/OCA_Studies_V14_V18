package OCA_Hepsi.V14.Q_85_127;
//
public class Q93 {

}
    class Caller {
        private void init() {
            System.out.println("Initialized");
        }

        private void start() {
            init();
            System.out.println("Started");
        }

        /*
        eger bu skilde yapilmis olsaydi herhangi bir hataya sebep olmayacakti
        sebebi, classin altinda bulunan private metodlar baska bir class a cagrilamaz, private access modifier den
        dolayi
        * */
//        public static void main(String[] args) {
//            Caller c = new Caller();
//            c.start();
//            c.init();
//        }
    }

    class TestCall {
        public static void main(String[] args) {
            Caller c = new Caller();
//            c.start();
//            c.init();
        }
    }

//What is the result?
//A. An exception is thrown at runtime.
// B. InitializedStartedInitialized
//C. InitializedStarted
// D. Compilation fails.
// Answer: D
