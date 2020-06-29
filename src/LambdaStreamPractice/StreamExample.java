package LambdaStreamPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//we will do filter 100 or more billions
//https://www.youtube.com/watch?v=FWoYpM-E3EQ
//keep on coding channel
//go over Predicates, Consumers, Functions and Suppliers which would help with understanding. Other than that, great video
public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Warren Buffet", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckerberg", 50));


        System.out.println("========================old model for loop========================");

        //We are making new list for people who are in our criteria
        //we scan those people with for statement
        //we apply our condition
        //The first method
        List<Person> hundredClub = new ArrayList<>();
        for (Person p : people){
            if (p.billions >= 100){
                hundredClub.add(p);
            }
        }
        //we are printing out club list by using lambda expressions
        //(Person person) -> bu sekilde oldugu gibi boylede olur  person ->
        hundredClub.forEach(person -> System.out.println(person.name));


        System.out.println("================================================");
        System.out.println("========================Stream method========================");


        //The second method by Stream
        List<Person> hundredClubWithStreamMethod = new ArrayList<>();

        //filter in here, we want to loop through each person
        //after arrow notation, and than we will write what we want to filter on
        //like if person.billions is greater than or equals 100
        //so we want it return new list, we will use collect, sanirim map de olur
        //and inside the collect we type Collectors.toList
        //what this does, all the code below return a list, because we used toList, Set, Map  and many more
        hundredClubWithStreamMethod = people.stream()
                .filter((Person person) -> person.billions >= 100)
                .collect(Collectors.toList());


        //yadabunu tek satirda da yazabilriiz, asagida oldugu gibi
//        List<Person> hundredClubWithStreamMethod = people.stream()
//                .filter(person -> person.billions >= 100)
//                .collect(Collectors.toList());


        hundredClubWithStreamMethod.forEach((Person person) -> System.out.println(person.name+" : " + person.billions));

        System.out.println("================================================");
        System.out.println("===========================Alphabetic Sorted names=====================");

        //second example with stream
        //we will use sorted function
        //we want to sort all the names alpabetically
        //we need to exaplin what we need to sort on
        List<Person> sortedStreamPerson = people.stream()
                .sorted(Comparator.comparing((Person person) -> person.name))
                .collect(Collectors.toList());
        System.out.println();
        sortedStreamPerson.forEach((Person person) -> System.out.println("Alfabetik sirali isimler: " +person.name));

        System.out.println("================================================");

        System.out.println("====================Filtered Sorted names============================");

        //third example
        //filtered sorted names
        //birden fazla sorted kullanilabilir
        List<Person> hundredClubWithStreamMethodFilteredSorted = new ArrayList<>();
        hundredClubWithStreamMethodFilteredSorted = people.stream()
                .filter((Person person) -> person.billions >= 100)
                .sorted(Comparator.comparing((Person person) -> person.name))
                .collect(Collectors.toList());
        System.out.println();
        hundredClubWithStreamMethodFilteredSorted.forEach((Person person) -> System.out.println("Alfabetik sirali " +
                "isimler: " +person.name + " Parasi: " +person.billions));


        System.out.println("================================================");


    }
     static class Person{
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }
    }
}
