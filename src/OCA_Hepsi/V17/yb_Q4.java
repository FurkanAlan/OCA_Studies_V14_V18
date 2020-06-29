package OCA_Hepsi.V17;

public class yb_Q4 {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        int c=1;
        int r1 = a * b / c + 1;
        int r2 = a / b * c + 1;
        int r3 = a * (b / ( c + 1 ));
//        int r4 = 3/2; //1
        System.out.println(r1 +" "+ r2 + " "+ r3 );
        // Ans = 7, 2, 3, 1
    }
}
