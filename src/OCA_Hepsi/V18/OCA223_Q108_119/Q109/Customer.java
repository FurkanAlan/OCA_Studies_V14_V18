package OCA_Hepsi.V18.OCA223_Q108_119.Q109;

//Given these two classes
public class Customer {
    ElectricAccount acct = new ElectricAccount();

    //acc ==> class a direk olusturmus oldugumuz class objesinin metodlarini cagiramiyoruz, metod icnde olmali
    public void useElectricity(double kWh) {
//        acct.addKWh(kWh);
    }


    public static void main(String[] args) {
        ElectricAccount hesab = new ElectricAccount();
        //eger void metod varsa direk metod adiyla cagrilir
//        hesab.addKWh(12);

//        System.out.println("sonuc: " + hesab.addKWh(1)); //burada tamper demek hesab 0 veya negatif olmamali demek
        // sanirim
    }
}

class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;
    //line1


/*Any amount of electricity used by a customer
 (represented by an instance of the Customer class)
 must contribute to the customer's bill
  (represented by the member variable bill)
  through the useElectricity method.
  An instance of the Customer class should
  never be able to tamper with or decrease
  the value of the member variable bill.
  How should you write methods in the
  ElectricAccount
   class at line n1 so that the member
   variable bill is always equal to the value
   of the member variable kwh multiplied by the
    member variable rate?
Lead to pass your exam quickly and easily.
A. Option A
 */


    //A ==> void idi bunu return type olarak degistirdim deger alabilmek icin
//    public void addKWh(double kWh) {
//
//        this.kWh = this.kWh + kWh;
//        this.bill = this.kWh * this.rate;
//
//    }

////  B

//    public void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh = this.kWh + kWh;
//            this.bill = this.kWh * this.rate;
////           System.out.println(this.bill);
//        }
//
//    }

////  C ==> private oldugu icin hata verir , ayni class icerisinde olmali

//    private void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }

    ////  D

//    public double addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            setBill(this.kWh);
//        }
//        return bill;
//    }
//
//    public void setBill(double kWh) {
//        bill = kWh * rate;
//    }


}


//  A. Option A
//  B. Option B
//  C. Option C
//   D. Option D
//   Answer: A
