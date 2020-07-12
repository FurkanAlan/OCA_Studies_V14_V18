package OCA_Hepsi.V18.OCA223_Q1_60.q056;

import java.util.Arrays;

public class Q056 {

    public static void main(String[] args) {
        String string = " "; //eger burasi "" olsaydi sonuc true true olurdu
//		System.out.println(Arrays.toString(string.getBytes()));
        string.trim();
        System.out.println(string.contentEquals("") + " " + string.isEmpty());
        //string.isEmpty() ==> 	According to hard-coded contract, method 'isEmpty' returns 'false' value when this.length() != 0
    }

}
//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true

