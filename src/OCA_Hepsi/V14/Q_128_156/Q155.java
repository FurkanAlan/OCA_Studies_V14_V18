package OCA_Hepsi.V14.Q_128_156;

import java.util.ArrayList;

public class Q155 {
	public static void main(String[] args) {

//		String myString = "Hello String ";
//		myString.trim();
//		int i1 = myString.indexOf(" ");
//		System.out.println(i1);
//		//cevap 5 oluyor


		ArrayList<Integer> points=new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);

		Integer a = 1;
		int b = 5;

		points.add(a);
		points.add(b);


		points.add(null);
//		Integer a = 1;
		System.out.println(points);
		System.out.println(points.indexOf(1) + ":" +points.indexOf(2)+ ":" +points.indexOf(3)+ ":" + points.indexOf(4)+ ":" + points.indexOf(null)+ ":" +points.indexOf(a) + ":" +points.indexOf(b));


		points.remove(1);
		System.out.println(points);

		points.remove(null);
		System.out.println(points);




		//	Integer a = 3;
	   //	points.remove(a);
	}

}
