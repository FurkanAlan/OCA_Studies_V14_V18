package OCA_Hepsi.V18.OCA223_Q120_180.q137;

public class Question137 {


    public static void main(String[] args) {

        int[][] n = {{1, 3}, {2, 4, 5, 7, 8, 9}}; //sorudaki array ise {1,3},{2,4} => 4 2 3 1
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = n[i].length - 1; j >= 0; j--) {
                System.out.print(n[i][j]);
            }
        }
    }
}


//What is the result?
//		
//		Answer: 4231