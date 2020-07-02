package OCA_Hepsi.V18.OCA223_Q120_180.q153;

public class Question153 {

    public static void main(String[] args) {
        Fieldint1 f1 = new Fieldint1();
        Fieldint2 f2 = new Fieldint2();
        Fieldint3 f3 = new Fieldint3();
        System.out.println("********1. versiyon********");
        f1.printAll();
        System.out.println("********2. versiyon********");
        f2.printAll();
        System.out.println("*******3. versiyon*********");
        f3.printAll();
        System.out.println("****************");

    }
}

//1. versiyon
class Fieldint1 {
    Character c; //Wrapper class
    boolean b;  //primitive
    float f;    //primite

    void printAll() {
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("f= " + f);
    }

}

//2. versiyon
class Fieldint2 {
    char c;    //primitive
    boolean b;  //primitive
    float f;    //primitive

    void printAll() {
        System.out.println("c= " + c);//c=
        System.out.println("b= " + b);//b=false
        System.out.println("f= " + f);//f=0.0
    }

}



//3. versiyon
class Fieldint3 {
    Character c; //Wrapper class
    Boolean b;  //Wrapper class
    Float f;    //Wrapper class

    void printAll() {
        System.out.println("c= " + c);    //null
        System.out.println("b= " + b);    //null
        System.out.println("f= " + f);    //null
    }

}