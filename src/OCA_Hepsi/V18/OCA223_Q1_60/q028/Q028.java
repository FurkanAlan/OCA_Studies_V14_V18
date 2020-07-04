package OCA_Hepsi.V18.OCA223_Q1_60.q028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028 {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(
                //eger buradaki ifadelerden bir tanesi bile return s.length() <= 2, bu sarti saglarsa true olur ancak
                // hic birisi saglamazsa false olacak
                //s -> diger yazim sekli
                s -> {
                    System.out.print(s);
                    return s.length() <= 2;
                    //burada tum elemanlarin uzunlugu 3 oldugu (eger Hi da uzunlugu 3 olsaydi mesela Hih) icin sart
                    // saglanmamis olacak ondan
                    // dolayi
                    // false olur
                }
        )) //eger buradaki ifade true ise removed yazdirilir, cunku if bir sart ifadesi oldug icin ici, true yada false
        {
            System.out.println("\nremoved");
        }
//        else {
//            System.out.println("\nnot removed");
//        }
    }
}
