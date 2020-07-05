package OCA_Hepsi.V18.OCA223_Q86_107;

public class Q86 {
}

class A {
    public void test() {
        System.out.println("A ");
    }
}


class B extends A {
    public void test() {
        System.out.println("B ");
    }
}


class C extends A {
    public void test() {
        System.out.println("C ");

    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();  //A b2 = new A(); burasi bu sekilde olursa CastException veriyor, C b2 = new C(); oldugunda
                         // A b3 = (B) b2; => bu kisim (B) b2;Inconvertible types; cannot cast hatasi veriyor
        A b3 = (B) b2;  // line n1 //burada bakilmasi gereken uc husus var birincisi hangi turden elimizde obje var ve
        // birde nereye referans olmus, mesela A b2 = new C(); b2 A turunde obje ve C2 ye referans oluyor
        //biz bunu tutup A b3 = (B) b2; yaparsak, b3 objesini (A turunde), (B) cast yaparak C2 ye refereans
        // yapan bir obje ye esitlemeye calisiyoruz. ancak bunlar arasinda
        // ucuncu olarak parent-child baglantisi olmadigi icin
        // istisna veriyor

        b1 = (A) b2;  // line n2
        b1.test();
        b3.test();
        //bu haliyle bize java.lang.ClassCastException sonucunu veriyor
    }
}
    /*
    What is the result? 
    A. AB
    B. AC
    C. CC
    D. A ClassCastException is thrown only at line n1.
    E. A ClassCastException is thrown only at line n2.
    Answer: D

     */
