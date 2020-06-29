package OCA_Hepsi.V14.Q_1_60.Q57;



class MyString {
    String msg;
    MyString(String msg){
        this.msg =msg;

    }
    MyString(){}
}
public class Test {
    public static void main(String[] args) {
//        StringBuilder xx = new StringBuilder("Bu bir deneme");
//        System.out.println(xx);
//        StringBuffer xxx = new StringBuffer("Bu bir denemedir");
//        System.out.println(xxx);
//        MyString tt = new MyString();
//        System.out.println(tt.msg);
        System.out.println("Hello "+ new StringBuilder("Java SE 8"));
        System.out.println("Hello "+ new MyString("Java SE 8").msg); //soruda .msg yok. O durumda hush code yazdirir

    }
}
/*

NOT: Q49_60.Q57 --> soruda p1 yani package name olarak verilmis
    What is the result?
    A
    Hello Java SE 8
    Hello Java SE 8

    B
    Hello java.lang.StringBuilder@<<hashcode1>>
    Hello Q49_60.Q57.MyString@<<hashcode1>>

    C
    Hello Java SE 8
    Hello Q49_60.Q57.MyString@<<hashcode1>>

    D
    Compilation fails at the Test class

    A. Option A
    B. Option B
    C. Option C
    D. Option D
    Answer: C

 */
