package OCA_Hepsi.V18.OCA223_Q120_180.q172;

public class S172 {

    public static void main(String[] args) {

        int num = 5;
        do
        {   //--num olursa cevap--> 4 print eder, do nun ozelligi geregi once islem yapmadan deger oldugu gibi alinir
            System.out.print(num-- + " "); //num-- olursa cevap--> 5 print
        } while (num != 0); //num==0 --> 5 print eder,
        //num!=0 --> 54321 print ediyor
    }

}
