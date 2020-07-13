package OCA_Hepsi.V18.OCA223_Q108_119.Q119;

public class App {
    String greet = "Welcome!";

    public App() {
        String greet = "Hello!";
    }

    public void setGreet() {
        String greet = "Good Day!";
//        System.out.println(greet);
    }

    public static void main(String[] args) {
        App t = new App();
        String greet = "Good Luck!";
//        t.setGreet();
        System.out.println(t.greet);
    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer C
 */
