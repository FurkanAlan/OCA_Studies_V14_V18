package OCA_Hepsi.V18.OCA223_Q181_203.Q181;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class A {
    public void a() {
    }

    int a;
}


class B {
    private int doStuff() {
//        private int x = 100; //(basinda private olmaz)//local variable da access modfier kullanamayiz
        int x = 100;
//        System.out.println(x);
        return x++; //bu degeri cagirdimiz zaman bize 100 veriyor cunku return x; ve x = x + 1; lakin bu deger
        // ulasilamaz ancak return ++x yapilirsa 101 olur, return x+1; ve x = x;
    }

//    public static void main(String[] args) {
//        B y = new B();
//        System.out.println(y.doStuff());
//    }
}

//C.Java:
//import java.io.*;  // import package tan once yapilmis bundan dolayi bu da olmaz
//package p1;
class C {
    public void main(String fileName) throws IOException {
    }
}

/*
A. Only the A.Java file compiles successfully.// Dogru Cevap
B. Only the B.java file compiles successfully.
C. Only the C.java file compiles successfully.
D. The A.Java and B.java files compile successfully.
E. The B.java and C.java files compile successfully.
F. The A.Java and C.java files compile successfully.
 */