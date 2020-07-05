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
            for (int b = 0; b < chs[a].length; b++) {
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
