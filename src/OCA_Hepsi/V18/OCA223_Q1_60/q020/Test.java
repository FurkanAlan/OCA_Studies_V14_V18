package OCA_Hepsi.V18.OCA223_Q1_60.q020;

public class Test {
	int a1;
	public static void doProduct(int a) {
		a = a * a;
	}
	public static void doString(String s) {
		s.concat(" " + s);
	}
	public static void main(String[] args) {
		Test item = new Test();
		item.a1 = 11;  // eger burasi olmasaydi global degisken olan a1 degerini alirdi o da 0
		String sb = "Hello";
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i+ " " + sb + " " + item.a1);
	}
}
