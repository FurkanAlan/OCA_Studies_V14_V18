package OCA_Hepsi.V14.Q_1_60;



public class Q9 {
    public static void main(String[] args) {
        AA a = new AA();
    }
}

    class CC {
        public CC() {
            System.out.println("C");
        }
    }

     class BB extends CC {
        public BB() {                   //line n1
            System.out.println("B");
        }
    }

      class AA extends BB {           //line n2
        public AA() {
            System.out.println("A");
        }

    }



//second version da classlarin yeri degismis



// what is the result ?

/*
What is the result?

A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2

Answer: A
 */