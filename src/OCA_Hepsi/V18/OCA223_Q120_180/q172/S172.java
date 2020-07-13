package OCA_Hepsi.V18.OCA223_Q120_180.q172;

public class S172 {

    public static void main(String[] args) {

        int num = 5;
        do
        {
            System.out.println(num);

            //--num olursa cevap--> 4 print eder, do nun ozelligi geregi once islem yapmadan deger oldugu gibi alinir
            System.out.println(num-- + " "); //num-- olursa cevap--> 5 print

            System.out.println(num);
        } while (num == 5); //num==0 --> 5 print sadece eder,
        //num!=0 --> 54321 print ediyor
    }

}
