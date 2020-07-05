package OCA_Hepsi.V18.OCA223_Q72_85;


public class Q_85 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyExceptions ne) {
            System.out.print("A");
        }
    }

    public static void method1() {// line n1
        try {
            throw Math.random() > 0.5 ? new MyExceptions() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.print("B");
        }
    }

}

class MyExceptions extends RuntimeException {
}
//What is the result?
//A. A
//B. B
//C. Either A or B
//D. A B
//E. A compile time error occurs at line n1
	
	    



