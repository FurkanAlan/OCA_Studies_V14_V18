package OCA_Hepsi.V18.OCA223_Q1_60.q042;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q042 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("A");
		sb.append("A");
		sb.append("A");
		System.out.println("before delete: " + sb);
		
		sb.delete(0, sb.length());   //StringBuilder, String => lenght().  List => size()
		
		System.out.println("after delete: " + sb);


//		String x = "abskd";
//		System.out.println(Arrays.toString(x.toCharArray()));
//		System.out.println(Arrays.toString(x.toCharArray()).contains("a"));
//		System.out.println(x.length());
//
//		List<Integer> y = new ArrayList<Integer>();
//		y.add(0,1);
//		y.add(1,2);
//		y.add(2,3);
//		y.add(3,4);
//		System.out.println(y.toString());
//		System.out.println(y.size());
	}
}
