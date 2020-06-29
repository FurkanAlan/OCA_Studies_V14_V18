package OCA_Hepsi.V18.OCA223_Q1_60.q019;

public class Q019 {
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
    private Q019(){

    }

    final static int methodA(int a){
        int x = 0;
        return x;
    }
    final static void methodA(String z){

    }

    final static int methodA(double b){
        int x = 0;
        return x;
    }
    static class denemeZ extends Q019{

    }
    public static void main(String[] args) {
        Q019 obj = new denemeZ();

    }
}
