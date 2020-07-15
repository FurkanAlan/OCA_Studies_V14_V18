package OCA_Hepsi.V18.OCA223_Q61_71;

interface II {
    public void displayII();
}

interface I2 {
    void method();
}

public class Q_71 {
}

class C12 {
    public void displayC2() {
        System.out.println("C2");
    }

}
// dogru cevap Compilation fails (bir yerde de cevabi A olarak gostermis lakin asil cevap compilation fails olmali

class C1 extends C12 implements II {
    //        And given the code fragment:
    public static void main(String[] args) {

        C12 obj1 = new C1();
        II obj2 = new C1();

//        C12 s = obj2;  //class'a interface in objectini assign ettis o yuzden hata verir hata nin sebebi
//         Required type: C12 Provided: II
//        II t = obj1;   //class'a class i,  interface e interface i assign yapabiliriz
        // Required type: II Provided: C12
//          C12 s = (C12) obj2;  ancak bu sekilde yapilirsa hata giderilmis olur
//        II t = (II) obj1;
        //yada diger cozum C12 imlement II interface olsaydi buda cozum olurdu tabi metodlari Override olmali

//        t.displayII();
//        s.displayC2();

    }

    @Override
    public void displayII() {
        System.out.println("C1");
    }
}

class cybertekQ19 {
    public static void main(String[] args) {
        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs[a].length; b++) {
                System.out.print(chs[a][b] + " ");
            }
            System.out.println();
        }
    }
}

abstract class TestX implements I2 {
    abstract void methodX();

}

class TestY extends TestX {

    @Override
    void methodX() {
    }

    @Override
    public void method() {

    }
}

class TestZ extends TestY {

}

abstract class Toy {
//    public Toy getToy() {
//        return new Toy(); //'Toy' is abstract; cannot be instantiated
//    }
}