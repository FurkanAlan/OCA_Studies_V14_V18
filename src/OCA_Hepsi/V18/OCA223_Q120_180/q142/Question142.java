package OCA_Hepsi.V18.OCA223_Q120_180.q142;

public class Question142 {

	public static void main(String[] args) {

		int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s: days){
            switch (s){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd-=1;
                    break;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);
    }

}
/*
* What is the result?
A. 3
B. 0
C. Compilation fails.
D. -1
*Answer: D
*
* */

/**?????Sinavda farklisi cikmis monday den sonra break varmis o da sonucu -1 olarak degistiriyor yazilmis fakat ben deneyince 1 olarak degisiyor??????????????
 *   int wd = 0;
 *         String days[] = {"sun", "mon", "wed", "sat"};
 *         for (String s: days){
 *             switch (s){
 *                 case "sat":
 *                 case "sun":
 *                     wd-=1;
 *                     break;
 *                 case "mon":
 *                     wd++;
 *                     break;
 *                 case "wed":
 *                     wd+=2;
 *             }
 *         }
 *         System.out.println(wd);
 *     }
 *
 * }
 * /*
 * * What is the result?
 * A. 3
 * B. 4
 * C. -1
 * D. Compilation fails.
 * Answer: C ??
 * * */

