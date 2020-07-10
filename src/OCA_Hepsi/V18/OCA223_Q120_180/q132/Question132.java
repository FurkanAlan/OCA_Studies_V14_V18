package OCA_Hepsi.V18.OCA223_Q120_180.q132;

public class Question132 {
    public static void main(String[] args) {
        int[][] arr = new int[2][5]; //burada ArrayIndexOutOfBoundsException sebep olan ilk dizi ifadesi [2],
        // eger 3 olsa exception vermez, cunku bu uzunlugu belirliyor
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};
//        arr[2] = new int[]{6, 8, 11};
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
/**
 * What is the result?
 * A. Compilation fails
 * B. 1 3
 * 1 3
 * C. 1 3
 * Followed by an ArrayIndexOutOfBoundsException
 * D. 1 3
 * 1 3 0 0
 * E. 1 3 5 7
 * 1 3
 * <p>
 * A. Option A
 * B. Option B
 * C. Option C
 * D. Option D
 * E. Option E
 * Answer: E
 * <p>
 * Explanation:
 * Your code:
 * <p>
 * public class Q17 {
 * public static void main(String[] args) {
 * <p>
 * int [] [] arr = new int [2][4];
 * arr[0] = new int [] {1, 3, 7};
 * arr [1] = new int [] {1, 3};
 * for (int[] a : arr) {
 * for (int i : a){
 * System.out.println(i + " ");
 * <p>
 * }
 * System.out.println();
 * }
 * }
 * }
 * <p>
 * output: 1 3 5 7
 * 1 3
 */
