package OCA_Hepsi.V18.OCA223_Q108_119.Q114;

public class Q114 {
    public static void main(String[] args) {
        String[][] arr = {{"A","B","C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    break;
                }
            }
            continue;
        }
    }
    /*What is the result?
     A. A B C
     B. A B C D E
     C. A B D E
    D. Compilation fails.
    Answer: C

     */


//    public static void main(String[] args) {
//        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println(arr[i][j] + " ");
//                if (arr[i][j].equals("E")) { // buradaki E nin bi anlami yok cunku continue var
//                    continue;
//                }
//            }
//            continue;
//        }
//    }


//        public static void main(String[] args) {
//        String[][] arr={{"A"},{"D","E"}};
//        for (int i=0; i<arr.length; i++){  //lenght 2
//            for (int j = 0; j < arr.length; j++) {  //lenght 2, buradaki 2. eleman olmadigi icin  ArrayIndexOutOfBoundsException
//                System.out.println(arr[i][j]+" ");
//                if(arr[i][j].equals("C")){
//                    break;
//                }
//            }
//            continue;
//        }
//    }
}
