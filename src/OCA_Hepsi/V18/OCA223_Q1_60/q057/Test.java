package OCA_Hepsi.V18.OCA223_Q1_60.q057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.nameString + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45),
                new Person("Charlie", 40),
                new Person("Smith", 38));
        // Line n1

        // Which code fragment, when inserted at line n1, enables the code to print Hank?

//		checkAge (iList, () -> p.getAge() > 40);  //buradaki problem () icersinde p olmaliydi
//		checkAge (iList, Person p -> p.getAge () > 40);// burada Person p parantez icinde olmaliydi
        checkAge(iList,p -> p.getAge () > 40);
//		checkAge (iList, (Person p) -> {p.getAge() > 40});
    }
}

//diger dogru yazim sekilleri

//        checkAge(iList,
//                p -> {
//                    return p.getAge() > 40;
//                }
//        );
//
//        checkAge(iList,
//                (Person p) -> {
//                    return p.getAge() > 40;
//                }
//        );