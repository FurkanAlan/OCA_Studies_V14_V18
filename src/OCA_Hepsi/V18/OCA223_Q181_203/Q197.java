package OCA_Hepsi.V18.OCA223_Q181_203;

//A yanlis public class da main metod yok
public class Q197 {

    /*
    *
197. Which three statements are true about the structure of a Java class? (Choose three.)
A. A public class must have a main method.
B. A class can have only one private constructors.
C. A method can have the same name as a field.
D. A class can have overloaded static methods.
E. The methods are mandatory components of a class.
* F. The fields need not be initialized before use.
*
* Answer: C D F
* */

}

//B. A class can have only one private constructors. ,  yanlis
class privateCOnstructros {
    private privateCOnstructros() {
    }

    private privateCOnstructros(int x) {
    }

    private privateCOnstructros(int x, int y) {
    }

    private privateCOnstructros(double x, int y) {
    }
}

//C. A method can have the same name as a field. , dogru
class methodField {
    int fieldTest;

    public void fieldTest() {

    }
}



//D. A class can have overloaded static methods. , dogru
//ancak, override static final private olamiyor
class overloadedStatic {
    public static void methodOverloading() {

    }

    public static void methodOverloading(int x) {

    }

    public static void methodOverloading(int x, int y) {

    }

    public static void methodOverloading(double x) {

    }
}

//F. The fields need not be initialized before use. , dogru

class FieldTestForX {
    int number;

    public static void main(String[] args) { //direk cagirmak icin static olmali cunku main static metod
        //eger static int number; System.out.println(number); bu sekilde de cagrilabilir
        FieldTestForX fieldTestForX = new FieldTestForX();
        System.out.println(fieldTestForX.number);
    }
}