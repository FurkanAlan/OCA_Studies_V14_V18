package OCA_Hepsi.V18.OCA223_Q1_60.q043;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q043 {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(
                (String s) ->
                {
					System.out.println(s);
//					System.out.println(Arrays.asList(arr).toString().toCharArray());
//					System.out.println(Arrays.toString(arr));
//					System.out.println(Arrays.toString(s.toCharArray()));
//					System.out.println(arr.clone());
                    return s.length() <= 2;
                }
        )) {
//			System.out.println(s + "removed");
        }
    }

}
