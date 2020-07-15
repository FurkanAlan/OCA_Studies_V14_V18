package OCA_Hepsi.V18.OCA223_Q204_223.Q221;

import java.util.ArrayList;
import java.util.List;

public class Q221 {
    public static void main(String[] args) {
        List colors=new ArrayList();
        colors.add("green"); //aslinda bunun manasi 0. index e green elemannini yerlestir demektir
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);  //yada colors.remove("red"); seklinde de yapilabilir buradaki red String oldugu icin obje
        // oluyor ve obje direk nereye karsilik geliyorsa onu siliyor
        colors.add(3,"cyan");
        System.out.println(colors);
    }
}
//    What is the result?
//        A. [green, red, yellow, cyan]
//        B. [green, blue, yellow, cyan]
//        C. [green, red, cyan, yellow]
//        D. An IndexOutOfBoundsException is thrown at runtime.
//        Answer: D  ama cevap B cikti
