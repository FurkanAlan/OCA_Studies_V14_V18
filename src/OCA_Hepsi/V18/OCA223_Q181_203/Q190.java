package OCA_Hepsi.V18.OCA223_Q181_203;

public class Q190 {
}

class E1 extends Exception{

}

class E2 extends RuntimeException{

}

 class App{
    public void m1() {
        System.out.println("m1.Accessed.");
//        throw new E1();
    }

    public void m2(){
        System.out.println("m2.Accessed.");
        throw new E2();

    }

    public static void main(String[] args) {
        int level = 1;
        App obj = new App();
        if (level <= 5 && level >= 3){
            obj.m1();
        } else {
            obj.m2();
        }
    }
}

/*
*
Which statement is true?
A. The program prints m1.Accessed.
B. The program fails compile due to the unhandled E1 exception.
C. The program prints m2.Accessed.
D. The program fails to compile due to the unhandled E2 exception.
* */
//Ans = B
