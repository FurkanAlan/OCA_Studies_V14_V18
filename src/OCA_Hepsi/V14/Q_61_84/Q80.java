package OCA_Hepsi.V14.Q_61_84;

public class Q80 {

    public static void main(String[] args) {
        float var1 = (12_345.01 <= 123_45.00)? 12_456 : 124_56.02f;
        //buradaki sayilar double cinsinden olgudu icin float cevrilmeli buna da type casting denliyor
        //yani mantik olarak sayilarin _ silinip duz sayi gibi
        // dusunulebilir mesela 12_345.01 => 12345.01 bu sayi 12345.00 sayisinddan her zaman buyuk oldugu icin false
        // dur ondan dolayi else yazdirilir, sonra da cikan
        // sayi ila toplanir
//        float x = (float) 12_345.01;
//        float y = (float) 123_45.00;
//
//        System.out.println(x);
//        System.out.println(y);
        //12456.02
        float var2 = var1 + 1024;
        System.out.print(var2);

//        double x = 12_345.01;
//        double y = 12_345.00;
//        System.out.println(x +" : " +y);
    }
}

//Answer : D => 13480.02
