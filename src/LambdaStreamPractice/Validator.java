package LambdaStreamPractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    private Pattern pattern;
    private final static String PasWordValid="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public Validator() {
        pattern=Pattern.compile(PasWordValid);
    }

    public boolean validate(String password) {
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {

        System.out.println("enter your password");
        System.out.println("6 character upto 20, no space, one upper, one lower, one special, one digits");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        Validator pasword=new Validator();
        System.out.println(pasword.validate(pass));

//                String pw="Mevlut123";
    }


}
