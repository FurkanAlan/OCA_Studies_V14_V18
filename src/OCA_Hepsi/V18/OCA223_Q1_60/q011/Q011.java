package OCA_Hepsi.V18.OCA223_Q1_60.q011;

public class Q011 {
    public static void main(String[] args) {
        String[] strs = {"A", "B"}; //farkli array yazimi String[] strs = new String[]{"A","B"};
        // eger burada A, B elemanlari olmasayaydi A NullPointerException is thrown at
        // runtime sonucunu verirdi, String[] strs = new String[2];
//        String[] strs = new String[]{}; // her zaman bos bir string herhangi bir hata vermiyor herhangi bir
        // sonucta
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx); //burada henrhangi bir atama yapilmamis, eger sout yapilsaydi sadece
            // A, B degerlerini yazdirirdi
//			String x = strs[idx].concat(" element " + idx);
//			System.out.println(x); // boyle yapildiginda A element 0 B element 1, sonuclarini veriyor
            idx++;
            // idx is incremented in the loop but nothing is affected outside of the loop
            // there is no syso nothing is printed from this loop
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
