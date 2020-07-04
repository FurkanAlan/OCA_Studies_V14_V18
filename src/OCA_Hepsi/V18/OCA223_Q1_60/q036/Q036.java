package OCA_Hepsi.V18.OCA223_Q1_60.q036;

public class Q036 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " " ); // prints arr[0] which is A
			if (arr[i].equals("B")) {  // returns false for arr[0]
				continue; // if condition is false so does not continue in loop, (arr[i].equals("A"), eger iceris A
				// olsaydi loop B  yi de yazdirir daha sonra da alttaki satira gecerdi ve Work Done yazdirir, sonra
				// da program tamamlanmis olurdu
			}
			System.out.println("Work Done"); // printed out
			break;
		}
	}
}
