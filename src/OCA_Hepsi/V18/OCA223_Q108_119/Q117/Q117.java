package OCA_Hepsi.V18.OCA223_Q108_119.Q117;

import java.util.ArrayList;

public class Q117 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}

class SetExample {
    public static void main(String args[]) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        System.out.println("ArrayList before update: " + arraylist);
        //Updating 1st element
        arraylist.set(0, 11);
        //Updating 2nd element
        arraylist.set(1, 22);
        //Updating 3rd element
        arraylist.set(2, 33);
        //Updating 4th element
        arraylist.set(3, 44);
        //Updating 5th element
        arraylist.set(4, 55);
        System.out.println("ArrayList after Update: " + arraylist);
    }
}
/*What is the result?
 A. A B C D
 B. A C D
 C. A C D D
 D. A B D
 E. A B D C
 Answer: A B C C

 */