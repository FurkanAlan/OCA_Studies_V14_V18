package OCA_Hepsi.V18.OCA223_Q120_180.q136;

import java.util.ArrayList;
import java.util.List;

public class Question136 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0,"Java");
        arrayList.forEach((String a) -> {
            a.concat("Forum");
        });
        arrayList.replaceAll((String s) -> {
            return s.concat("Group");
        });
        System.out.println(arrayList);
    }


}
