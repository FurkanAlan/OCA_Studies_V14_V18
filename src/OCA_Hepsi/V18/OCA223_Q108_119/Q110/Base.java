package OCA_Hepsi.V18.OCA223_Q108_119.Q110;

//bunu kontrol edelim package leri mi ayri anlamadim
public class Base {
    public void test() {
        System.out.println("Base ");
    }
}

class DerivedA extends Base {
    public void test() {


        System.out.println("DerivedA ");
    }
}

class DerivedB extends DerivedA {

    public void test() {
//        Base x = new Base();
//        x.test();
//        Base y = new DerivedA();
//        y.test();
//        DerivedA z = new DerivedA();
//        z.test();
//        DerivedB w = (DerivedB) new Base(); // bu ifade ClassCast a sebep oluyor, parent-child
//        z.test();
//
//        DerivedA tou = new DerivedB(); // bu sekilde oldugunda Exception in thread "main" java.lang.StackOverflowError
//        tou.test();

//        DerivedB chi = new DerivedB(); // bu sekilde oldugunda Exception in thread "main" java.lang.StackOverflowError
//        chi.test();
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3; //eger bu Base b4 = (DerivedB) b2; skilde olsa CastException veriyor cunku DerivedB
        // burada child oluyor ve biz bunu DerivedA(), yani parent e referans yapan bir degere esitlemeye
        // calisiyoruz, upper cast, down cast, buradaki sorun  daha genis olan birseye cast yapamilamiyor
        // aslinda bu mantiki olarak widening ve narrowing gibi
        //DerivedB b4 = (DerivedA) b3; bu sekilde oldugunda da burasi da hataya sebep oluyor,
        // Required type: DerivedB  Provided: DerivedA
        //DerivedA b4 = (DerivedA) b3; Base b4 = (DerivedA) b3; bunlarda herhangi bir hata yok

        //(DerivedA) bu sekilde olmasi sonucu etkilemiyor, b3 den dolayi sonuc DrivedB yazdirir ve buradaki (DrivedA)
        // sadece gostermelik bir ifade
        b1.test();
        b4.test();

    }
}
/*What is the result?
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
 E. A ClassCastException is thrown at runtime.
Answer: C

 */
