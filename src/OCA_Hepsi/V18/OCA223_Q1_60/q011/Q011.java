package OCA_Hepsi.V18.OCA223_Q1_60.q011;

public class Q011 {
	public static void main(String[] args) {
		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
			// idx is incremented in the loop but nothing is affected outside of the loop
			// there is no syso nothing is printed from this loop
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
