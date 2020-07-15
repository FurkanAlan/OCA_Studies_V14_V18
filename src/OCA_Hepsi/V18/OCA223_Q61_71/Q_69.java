package OCA_Hepsi.V18.OCA223_Q61_71;

public class Q_69 {

}

class Test {
    public static void main(String[] args) {

        String[][] chs = new String[5][2]; //lenght 5 oldugu icin, hataya sebep oluyor, ikinci dizinin mutlaka aynisi
        //yada daha buyugu olmali bos [] birakildigindada hata veriyor
        chs[0] = new String[2];             // burada bulunan iki bosluga 5 eleman sigdirmaya calisiyoruz, hata verir
        chs[1] = new String[5];             //new String[2][5] boyle olsa herhangi bir sorun olmaz, tabi
        int i = 97;                         //b<chs.length burasi bu probleme sebep oluyor chs[a] olsa sorun yok
        //System.out.println(chs[1].length);

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {  //aslinda hataya sebep olan ikinci for loop dongusudur cunku
                // bizden b < chs.length yani b < 5 0-4 e kadar olan degerleri yerlestirmemizi istiyor lakin ilk
                // array in uzunlugu chs[0] = new String[2]; 2 olarak tanimlanmis 2 bosluga 5 eleman
                // yerlestirilemiyeceginden dolayi ArrayIndexOutOfBoundsException sonucunu veriyor

                //chs.length ifadesi chs[a].length seklinde yazilsaydi herhangi bir hata vermezdi cunku bu ifadenin
                // manasi 1 bosluga bir sayi yazdir demek,
                //chs[0] = new String[2]; iki boslugu oldugu icin sadece  97  98  sayilarini yerlestirir
                //chs[1] = new String[5];  99  100  101  102  103 sayilarini yerlestirir 5 boslugu oldugu icin
                //her ne kadar burada chs[2], chs[3], chs[4] yazilmamis olsa da aslinda onlarda var
                //cunku biz ilk olarak arrayi olustururken String[][] chs = new String[5][2] kullandik bundan dolayi
                //chs[2]  dizisine  104  105 sayilari gelir cunku [5][2] 5 toplam uzunlugu veriyor, ve satir sayisi 2
                // yada diger adiyla kolom sayisini veriyor

                // buradaki ifade de ise chs[1] = new String[5]; biz sonradan degisiklik yaptigimiz icin
                // 5 elemani oluyor 1. index in veya uzunluk olarak dusunlurse 2. dekinin alabilecegi eleman sayisi

                //chs[3]  dizisine   106  107  sayilari gelir
                //chs[4]  dizisine    108  109   sayilari gelir bu sekilde tum dizinin bosluklarina sayilar
                // yerlestirilmis olur
                chs[a][b] = " " + i;
                i++;

            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
//answer =ArrayIndexOutOfBoundsException

//second version Q82
//public static void main(String[] args) {
//
//    String[][] chs = new String[2][5];
//    chs[0] = new String[2];
//    chs[1] = new String[5];
//    int i = 97;
//    //    System.out.println(chs[1].length);
//
//
//    for (int a = 0; a < chs.length; a++) {
//        for (int b = 0; b < chs.length; b++) {
//            chs[a][b] = " " + i;
//            i++;
//
//        }
//    }
//    for (String[] ca : chs) {
//        for (String c : ca) {
//            System.out.print(c + " ");
//        }
//        System.out.println();
//    }
//}
//}
//97  98
//99  100 null null null


/**
 * What is the result?
 * A. 97 9899 100 null null null
 * B. 97 9899 100 101 102 103
 * C. Compilation fails.
 * D. A NullPointerException is thrown at runtime.
 * E. An ArrayIndexOutOfBoundsException is thrown at runtime.
 * <p>
 * Answer: E
 */


class testX{
    testX(){

    }
}