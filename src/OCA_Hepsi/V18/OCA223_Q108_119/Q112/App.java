package OCA_Hepsi.V18.OCA223_Q108_119.Q112;

public class App {
    static int count = 1; //tum vezu statik olmamasi veya cagiran metod un statik olmasi
//    public static void displayMsg(){ //problem bu metodun statik olmasi, count ise degil
//        count++;                                         //line1
//        System.out.println("Welcome"+"Visit Count"+count); //line2
//    }

    public static void main(String[] args) {
//        App.displayMsg();           //line3
//        App.displayMsg();           //line4
    }
}
/*What is the result?
A. Compilation fails at line n3 and line n4.
 B. Compilation fails at line n1 and line n2.
 C. Welcome Visit Count:1Welcome Visit Count: 1
  D. Welcome Visit Count:1Welcome Visit Count: 2
  Answer:B  ?

 */