package OCA_Hepsi.V18.OCA223_Q204_223.Q223;

public class Q223 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = 0;
        do {  //i++; ilk sirada olursa 1. index elemani olan 2 den baslar
            System.out.println(arr[i] + " ");
//            System.out.println("\n\t"+i);
            i++;
//            System.out.println("\n\t\t"+i); //en son ifade yukariya 4 olarak gelecek bunun manasi 4. index deki eleman
            // olmadigi icin ArrayIndexOutOfBoundsException verecek ve loop dan cikmasinin sebebi de 4++; 5 olacak ve
            // bu sekilde while dongusunun icerisine girecek while (5 < 5) false olacagi icin dongu bitiyor
        } while (i < arr.length + 1);

    }
}
/*What is the result?
A. 1 2 3 4followed by an ArrayIndexOutOfBoundsException
B. 1 2 3
C. 1 2 3 4
D. Compilation fails.
 Answer:  A  aciklamsinda Console 8 9 10 farkli demis

 */