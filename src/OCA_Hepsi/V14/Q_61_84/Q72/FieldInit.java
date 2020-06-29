package OCA_Hepsi.V14.Q_61_84.Q72;

public class FieldInit {
    // What is the result?

    Byte byt;
    byte by;

    Short sh;
    short s;

    Integer in;
    int i;

    Long lg;
    long l;

    Float fl;
    float f;

    Double db;
    double d;

    Boolean bol;
    boolean b;

    Character c;  //if it is Character it gives null wrapper class oldugu icin
    char ch; //if it is char it gives empty

    //string non primitive and no wrapper class
    String  st;


    void printAll(){

        System.out.println("Byte = " + byt);
        System.out.println("byte = " + by);
        System.out.println();

        System.out.println("Short = " + sh);
        System.out.println("short = " + s);
        System.out.println();

        System.out.println("Integer = " +in);
        System.out.println("int = " +i);
        System.out.println();

        System.out.println("Long = " +lg);
        System.out.println("long = " +l);
        System.out.println();


        System.out.println("Float = " + fl);
        System.out.println("float = " + f);
        System.out.println();

        System.out.println("Double = " + db);
        System.out.println("double = " + d);
        System.out.println();


        System.out.println("Boolean = " + bol);
        System.out.println("boolean = " + b);
        System.out.println();


        System.out.println("Character = " + c);
        System.out.println("char = " + ch);
        System.out.println();


        System.out.println("String = " +st);

    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }

    //cevap : c = null
    //        b = false
    //        f = 0.0
}
