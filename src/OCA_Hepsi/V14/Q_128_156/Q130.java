package OCA_Hepsi.V14.Q_128_156;

public class Q130 {

}

// Given the code fragment:
abstract class Planet {
    //1- buradaki izin yetkisi, protected oldugu icin eger baska bir sinif bu methodu kullaniyorsa, izin yetkisi en az
    // protected olabilir, yada public mesela default olmuyor
    //2- protected method normal class yada public class in icerisinde de kullanilabilir
    //3- abstract olmadiginda da override oluyor
    protected void revolve() {          //line n1
    }

    //1- abstract method sadece, abstract class yada interface de olabilir
    //2- abstract metod da body olamaz
    //3- private access modifier kullanilamaz, default oldugu icin bir daha defualt yazilamiyor, public, protected
    // yazilabilir
    //4- static yada final olamaz
    abstract void rotate();         //line n2
}

//eger extend edilen class bir abstract ise metodlari mutlaka implement edilmeli
//eger bunlar abstract ise implment diye geciyor, mesela Implements method in Planet (OCA_Hepsi.V14.Q_128_156)
//
class Earth extends Planet {
//     void revolve() {             //line n3
//    }

    //burasi yukaridaki metodu implemnt ettigi icin en dusuk access modifier default olabilir, default hicbir sey
    // yazilmadigi zaman, protected yada public de olur
      void rotate() {     //line n4
    }
}
// Which two modifications, made independently, enable the code to compile? (Choose two.)
// A. Make the method at line n1 public.
// B. Make the method at line n2 public.
// C. Make the method at line n3 public.
// D. Make the method at line n3 protected.
// E. Make the method at line n4 public.
// Answer: CD
/*
Q_52
    abstract class Planet {
     protected void revolve () {         //line n1
     }
     abstract void rotate ();            //line n2
     }
     class Earth extends Planet {
      void revolve () {                   //line n3
       }
     protected void rotate () {           //line n4

     Which two modifications, made independently, enable the code to compile?
     A. Make the method at line n1 public.
     B. Make the method at line n2 public. public
     C. Make the method at line n3 public. protected
     D. Make the method at line n3 protected.
     E. Make the method at line n4 public.
     Answer: B C
 */