package OCA_Hepsi.V18.OCA223_Q61_71;


import java.util.Arrays;

interface I {
    public void displayI();
}

abstract class C22 implements I {
    public void displayC2() {
        System.out.print("C2");
    }
//  public void displayI(){
//
//  }
}


class C11 extends C22 {
    public void displayI() {
        System.out.print("C1");
    }
}

public class Q_66 {
    // And the code fragment:
    public static void main(String[] args) {

        C22 obj1 = new C11(); //obj1 abstract turunden bir degisken ve onun ozelliklerini tasiyor ve C1 objesine referans
//        I obj2 = new I()
        //Buradaki ifade I obj2 = new I(); seklinde olsa, 'I' is abstract; cannot be instantiated compile hatasi veriyor
        //             @Override public void displayI() {} bu sekilde metodu implement edilmek zorunda
        // I obj2 = new I(); C22 s = (C22) obj2;  bu sekliyle kullanilsa bize her nekadar interface in metodu
        // @Override yapilsa da yine de (C22) obj2; ifadesi bize Casting 'obj2' to 'C22' will produce
        // 'ClassCastException' for any non-null value  runtime hatasi verecek

        I obj2 = new C11(); ////obj2 interface turunden bir degisken ve C1 e objesine referans yapiliyor., eger
        // referans noktasi C11 degilde I(); olsa yukaridaki acikladigim durum gerceklesiyor

        C22 s = (C22) obj2; //eger Cast C22 kaldirlirsa, Required type:C22 Provided:I, Compile hatasi veriyor
        //belki bunu C22 s = (C22) (I) (C11) obj2; sekilde de dusunulebilir
        //obj2 bir I turunden variable ve referans noktasi C11, C11 de C22 ile super-sub baglantisi var yani
        //C22: Parent,    C11: child oluyor ondan dolayi ClassCastException vermiyor
        //yani Down Casting oldugu icin

        //I obj2 = new C11();    C22 s = (C22) obj2;   mesela IntelliJ nin bize tavsiyesi
        //C22 obj2 = new C11();   ve  C22 s = obj2; olsun diyor


        I t =  (C11) obj1;         //alt (C22 veya C11) dan uste (I) gidildigi zaman Cast gerekli, diger turlu hata
        // verir
        //Mesela burada Cast olmasaydi Interface de olustu
        //t obj1 referans yapiyor ve obj1 ise C1 objesine referans yapiyor t.displayI da C1 sinifi
        // icerisindeki metodu cagirir
        //eger I t = (C11) obj1; bu sekilde Cast yapilsa, C11 veya C22, I  in herhangi bir hukmu yok

        //I t = (C22) obj1; bu sekilde yazsak zaten obj1 C22 turunden bir degisken oldugu icin gereksiz
        //Burayi tam anlamdim I t =  (C11) obj1; bu ne icin hata vermiyor? sanirim Interface cevirebilecek bir ifade
        // olamiyor zaten I as = new I(); seklinde yazilabilmesi icin metodlarin Override yapilmasi gerekiyor ondan
        // dolayi sanirim birde I burada super-super class oldugu icin
        t.displayI();  // yazdirirkende nereye gittigine bakmak lazim
                       //I t =  (C11) obj1;  oncesinde de  C22 obj1 = new C11(); oldugu icin yani bu C11 sinifina
                       // gidecek ve oradan deger yazdiracak
                        //.displayI() metod body si bos oldugu icin bu sadece yonlendirme yapacak
        s.displayC2(); //buradaysa C2 ye cast yapilmis (C22 s = (C22) obj2;) eger yapilmasaydi hata verirdi,
                       //burada ise s.displayC2() C2 sinifinin display metoduna git diyor sonuc da C2 olur

    }
}
//What is the result?
//A. C1C2
//B. C1C1
//C. Compilation fails.
//D. C2C2
//Answer: A

//class TextXX{
//    public static void main(String[] args) {
////        System.out.println("The arguman testing1: " + Arrays.toString(args));
//        System.out.println("The arguman testing2: " +Arrays.toString(args).length());
//        System.out.println("The arguman testing3: " +args[0]);
//        System.out.println("The arguman testing4: " +args[0].length());
//        System.out.println("The arguman testing5: " +args[3]);
//        System.out.println("The arguman testing6: " +args[3].length());
//    }
//}