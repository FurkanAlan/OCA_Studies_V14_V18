package OCA_Hepsi.V18.OCA223_Q120_180.q146;

import java.util.Arrays;

public class Question146 {

	public static void main(String[] args) {
		// Given the code fragment
		String[] strs=new String[2];
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));
		int idx=0;
//		strs[0] = "A";
		System.out.println(strs[0].concat("element "));
		//we can not concat if array is null

		for (String s : strs) {
			strs[idx].concat("element "+idx);
			idx++;
		}

		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
			
			//Answer: D
			
		}
		/*
		 * What is the output?
		 * A. Element 0Element 1
		 * B. Null element 0Nullelement 1
		 * C. NullNull
		 * D. A null pointer exception is thrown at runtime.
		 */

	}

}

