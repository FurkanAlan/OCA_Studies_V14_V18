package OCA_Hepsi.V14.Q_61_84.Q63;

public class C2 {
    public void displayC2() {
        System.out.println("C2");
    }
}

interface I {
    public void displayI();
}

class C1 extends C2 implements I {
    public void displayI() {
        System.out.println("C1");

    }

    //        //And given the code fragment:
    public static void main(String[] args) {


        C2 obj1 = new C1();
        I obj2 = new C1();

            C2 s = (C2) obj2;  //class'a interface in objectini assign ettis o yuzden hata verir
            I t = (I) obj1;   //class'a class i,  interface e interface i assign yapabiliriz

//            t.displayI();
//            s.displayC2();
        //calisan versiyonu bize sonuc olarak C1 ve C2 verir
//            C2 s = obj1;
//            I t = obj2;

// dogru cevap Compilation fails (bir yerde de cevabi A olarak gostermis lakin asil cevap compilation fails olmali

        Soru63.Soru63CalisanVersiyonu();
    }
}

class Soru63 extends C1 {
    public static void Soru63CalisanVersiyonu() {
        C2 obj1 = new C1();
        I obj2 = new C1();
        C2 s = obj1;
        I t = obj2;
        t.displayI();
        s.displayC2();
    }

}



