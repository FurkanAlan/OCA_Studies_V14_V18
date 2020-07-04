package OCA_Hepsi.V18.OCA223_Q1_60.q019;

class XY {
    //    public void methodXY(){}
    private void XY() {
    }

}

public class Q019 extends XY {
    /*
19. Which three statements are true about the structure of a Java class? (Choose three.)
A. A class cannot have the same name as its field.
B. A public class must have a main method.
C. A class can have final static methods.
D. A class can have overloaded private constructors.
E. Fields need to be initialized before use.
F. Methods and fields are optional components of a class.
*/
//    Ans = CDF

    //    A , class ve field ayni olabilir, yanlis
    class X { //class
        int X;  //field
    }


    //    B, olsada olur olmasa da, yanlis sadece runner olmaz

//    public static void main(String[] args) {
//        Q019 obj = new denemeZ();
//
//    }

    //    C, final statik metod oluyor, sinifin icerisinde, dogru
    final static int methodA(int a) {
        int x = 0;
        return x;
    }

    //    D, final statik metod oluyor, sinifin icerisinde, dogru

    private void XY() {
    } // bu ifade parent de bu metod, constructor un nasil tanimlandigina bagli, access modifier a
    //class can have overloaded private constructors


    //    E, fields, global instances tanimlanmasa da olur, yanlis
    int abx;

    //    F, Methods and fields are optional components of a class,  icerisi bos, yani metod veya field olmadan da
    //    olur, optional components of a class, dogru
    class XYZ {
    }


    final static void methodA(String z) {

    }

    final static int methodA(double b) {
        int x = 0;
        return x;
    }

    static class denemeZ extends Q019 {

    }

}
