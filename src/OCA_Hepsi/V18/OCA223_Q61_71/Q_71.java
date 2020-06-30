package OCA_Hepsi.V18.OCA223_Q61_71;

public class Q_71 {

}

interface II {
    public void displayI();
}

 class C12 {
    public void displayC2() {
        System.out.println("C2");
    }
}

class C1 extends C12 implements II {
    public void displayI() {
        System.out.println("C1");

    }

    //        And given the code fragment:
    public static void main(String[] args) {

        C12 obj1 = new C1();
        II obj2 = new C1();

//        C12 s = obj2;  //class'a interface in objectini assign ettis o yuzden hata verir
//        II t = obj1;   //class'a class i,  interface e interface i assign yapabiliriz

//        t.displayI();
//        s.displayC2();

    }
}
// dogru cevap Compilation fails (bir yerde de cevabi A olarak gostermis lakin asil cevap compilation fails olmali

