package OCA_Hepsi.V18.OCA223_Q1_60.q010;

public class TestScope {
	public static void main(String[] args) {
		int var1 = 200;
		System.out.print(doCalc(var1)); // prints the returned var from doCalc method
		System.out.print(" " + var1);  // prints the local var
	}
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}
}
