package OCA_Hepsi.V18.OCA223_Q1_60.q008;

public class Q008_2 {

	public static void main(String[] args) {
		String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " " );
				continue;
			}
		}
	}
}
