package ClassExtentionExample;

public class ExampleClass {
    public static void main(String[] args) {
        //konsoldaki sonuc B ve C oldu
//        A a = new A();
//        B b = new B();
//        C c = new C();

        //konsoldaki sonuc B ve C oldu
        A a = new A();
        A b = new B();
        A c = new C();


//        A d = b;
//        A e = c;

        //B ila C arasinda bir baglanti yok
        A f = (B) c;
        a = c ;



//        d.test();
//        e.test();

        //burasi calismiyor
        f.test();
        //bu calisiyor
        a.test();
    }
}
class A{
    public void test(){
        System.out.println("A ");
    }
}

class B extends A{
    public void test(){
        System.out.println("B ");
    }
}

class C extends A{
    public void test(){
        System.out.println("C ");
    }
}