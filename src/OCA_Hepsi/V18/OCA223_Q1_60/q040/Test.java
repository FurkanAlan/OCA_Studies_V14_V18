package OCA_Hepsi.V18.OCA223_Q1_60.q040;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
        int[] keys = findMax(numbers);            // 1. object is not created to invoke the method, so method should be:     static____findMax();{
        System.out.println(""+ Arrays.toString(keys));
        //string, stringbuilder => lenght     // list => size
    }

    /* line n1 */
    static int[] findMax(int[] max) {
        int[] keys = new int[3];                                //2. parameter of the method must be int array:    static____findMax(int [] numbers);{

        /* code goes here */
        return keys;                                                        // 3. return type should be int array:    static int[] findMax (int [] numbers)	;{
    }
}

//\Which method signature do you use at line n1?
//A.	public int findMax (int[] numbers)
//B.	static int[] findMax (int[] max)								// Answer: B
//C.	static int findMax (int[] numbers) 							 
//D.	final int findMax (int[] )
