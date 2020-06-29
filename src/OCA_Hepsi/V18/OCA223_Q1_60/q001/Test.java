package OCA_Hepsi.V18.OCA223_Q1_60.q001;

public class Test {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;	
		if (x++ < ++y) { // x is still 1,   y is 2 ==> true
			System.out.println("Hello ");
		}else {
			System.out.println("Welcome ");
		}
		System.out.println("Log " + x + ":" + y);  // x ix used again so x becomes 2		
	}
}
