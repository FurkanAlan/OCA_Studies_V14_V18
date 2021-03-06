package OCA_Hepsi.V18.OCA223_Q1_60.q022;

public class Q022 {
    public static void main(String[] args) {
        //buradaki ans, fields, global variable olmadigi icin mutlaka deger atanmasi gerekir diger turlu Compile
        // hatasi verecek
        int ans; // if it is initialized, for example int ans = 0;  --> Answer 0
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0;                                                // line n1
        } catch (Exception e) {
//			ans = 0; // ancak burada da ans ye deger atanmis olsaydi sonuc 0 olabilirdi
            System.out.println("Invalid calculation");
        }
//        System.out.println("Answer = " + ans);    // line n2
        // ans in the try-catch block can not be seen outside the block
    }
}
//What is the result?
//A.	Answer = 0
//B.	Invalid calculation
//C.	Compilation fails only at line n1.
//D.	Compilation fails only at line n2.
//E.	Compilation fails at line n1 and line2.

