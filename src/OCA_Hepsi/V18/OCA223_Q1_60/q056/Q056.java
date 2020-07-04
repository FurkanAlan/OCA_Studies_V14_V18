package OCA_Hepsi.V18.OCA223_Q1_60.q056;

public class Q056 {

	public static void main(String[] args) {
		String string = " "; //eger burasi "" olsaydi sonuc true true olurdu
		string.trim();
		System.out.println(string.contentEquals("") + " " + string.isEmpty());
	}

}
//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true

