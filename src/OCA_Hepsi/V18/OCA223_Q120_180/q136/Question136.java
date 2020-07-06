package OCA_Hepsi.V18.OCA223_Q120_180.q136;

import java.util.ArrayList;
import java.util.List;

public class Question136 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0, "Java");
        arrayList.forEach((String a) -> { //burada kullanilan metodlardan kaynakli farkliliklar var mesela bu
            // metodlarin kaynagina gidildiginde  forEach icin action.accept(t); var
            a.concat("Forum");
        });
        arrayList.replaceAll((String s) -> { //replaceAll da ise li.set(operator.apply(li.next())); set() metodu var ve Applies this function to the given argument.
            return s.concat("Group");
        });
        System.out.println(arrayList);
    }


}
