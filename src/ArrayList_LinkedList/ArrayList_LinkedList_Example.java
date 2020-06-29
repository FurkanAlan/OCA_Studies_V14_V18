package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList_Example {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        LinkedList<Integer>linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        System.out.println("========================get time comparasion========================");
        final long startTimeLL = System.nanoTime();
        linkedList.get(400);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.get(400);
        final long endTimeAL = System.nanoTime();

        long totalTimeLL = endTimeLL-startTimeLL;
        long totalTimeAL = endTimeAL-startTimeAL;

        System.out.println("Total linkedlist executaion time: " + totalTimeLL);
        System.out.println("Total arraylist executaion time: " + totalTimeAL);

        System.out.println("================================================");


        System.out.println("====================remove time comparasion============================");

        final long startTimeLL_Removing = System.nanoTime();
        linkedList.remove(500);
        final long endTimeLL_Removing = System.nanoTime();

        final long startTimeAL_Removing = System.nanoTime();
        arrayList.remove(500);
        final long endTimeAL_Removing = System.nanoTime();

        long totalTimeLL_Removing = endTimeLL_Removing-startTimeLL_Removing;
        long totalTimeAL_Removing = endTimeAL_Removing-startTimeAL_Removing;

        System.out.println("Total linkedlist executaion time: " + totalTimeLL_Removing);
        System.out.println("Total arraylist executaion time: " + totalTimeAL_Removing);

        //Burada silme deki hiz farkinin sebebi, linkedlist cant directly go to that index it hsd to iterate all
        // through to elment to get that specific elment then it can remove it

        //ArrayList can go to that elemtn but still need to shift the rest

        //ancak ilk elemnti silersek ArrayList cok dahs fazla vakit alacaktir

        //LinkedList would be more efficient for larger list size


        System.out.println("================================================");

    }
}
