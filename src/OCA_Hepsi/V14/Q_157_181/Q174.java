package OCA_Hepsi.V14.Q_157_181;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q174 {
}
class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }
    final static void deneme(){
        System.out.println();
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45),
                new Person("Charlie", 40),
                new Person("Smith", 38));
//checkAge (iList, () -> p.getAge () > 40);
//checkAge (iList, Person p -> p.getAge () > 40);
//checkAge (iList, p -> p.getAge () > 40);
//checkAge (iList, (Person p) -> { p.getAge () > 40;});



// checkAge (iList, (Person p) -> p.getAge () > 40); //bu sekilde de olur sikta degiliklik yaptik
//checkAge(iList, p -> p.getAge() > 40); //dogru cevap
    }
}

//Which code fragment, when inserted at line n1, enables the code to print Hank?

//A) checkAge (iList, () -> p.get Age () > 40);
//B) checkAge (iList, Person p -> p.getAge () > 40);
//C) checkAge (iList, p -> p.getAge () > 40);
//D) checkAge (iList, {Person p} -> {p.getAge () > 40;});

//Dogru cevap C

//lambdanin 3 farkli yazilisi var
//1.
// s -> s.length() <=2

//diger ornek
// p -> p.getAge () > 40
//(p) -> p.getAge () > 40) //de oluyor


//2.
//    s-> {
//        return s.length() <= 2;
//    }

//diger ornek
//    p -> {
//      return p.getAge() > 40;
//    }


//3.
// (String s) -> s.length() <=2

//diger ornek
// (Person p) -> p.getAge () > 40