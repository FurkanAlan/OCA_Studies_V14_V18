package OCA_Hepsi.V18.OCA223_Q120_180.q152;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class Q152 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("A", "B", "C", "D");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            if (e == "C") {
                break;
            } else {
//                continue;
                System.out.println(e);
            }
//            System.out.println(e);
        }
    }
}
