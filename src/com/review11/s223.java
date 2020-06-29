package com.review11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class s223 {

	public static void main(String[] args) {
//		int[] arr= {1,2,3,4};
//		int i=0;
//		do {
//			System.out.println(arr[i]+" ");
//		
//		i++;
//		} while (i<arr.length +1);
//		
		//1234follow by ArrayIndexOutOfBoundsException
		
		//220
		
		List<String>lst=Arrays.asList("EN","FR", "CH","JP");
		Iterator<String>itr=lst.iterator();
		while(itr.hasNext()) {
			String e=itr.next();
			
			if(e=="CH") {
				break;
				
			}
			System.out.print(e+" ");  //EN,FR
		}
		
	
		
		
		
		
		
		
		}
	

}

