package OCA_Hepsi.V18.OCA223_Q72_85;

public class Q_83 {

}
class Test8 {
	public static void main(String[] args) {

		Test8 ts = new Test8();  //buradaki ts bir variable ve referans noktasi Test8 sinifi oldugu icin o sinifin
		// icindeki metodlara ve degiskenlere bu skilde ulasmis oluruz ancak statiklerde hernekadar ts. dedikten
		// sonra secenekler arasinda da cikartmasada yine de kullanilabilir
		System.out.println(isAvailable);
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = true;
}
		/*
		 What is the result?
		A. Compilation fails.
		B. false true
		C. true false
		D. true true
		E. false false
		Answer: C
		 */

/*
// son kısmı değiştirip sormuşlar dikkat

public static void main(String[] args) {
		Test ts = new Test();
		System.out.println(isAvailable);
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;

	answer: false true
 */

 /*
 canvasta aynı soru şu şekilde;

 public class Test {

 static boolean isAvailable = false;

	public static void main(String[] args) {

		System.out.println( isAvailable + " " );
		isAvailable = doStuff();
		System.out.println( isAvailable );
	}

	public static boolean doStuff() {
		return !isAvailable;
	}

	Answer : false true
}
  */
