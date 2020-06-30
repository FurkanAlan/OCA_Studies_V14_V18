package OCA_Hepsi.V18.OCA223_Q86_107;

public class Q88 {
    public static void main(String[] args) {
        int x = 6;
        while (isAvailable(x)) {
            System.out.print(x); //bu haliyle infinite loop olacak cunku while(true) oluyor ve surekli 6 yazdirir
        }
    }
    public static boolean isAvailable(int x) {
        return --x > 0 ? true : false;

    }

}
//which modification enables the code to print 54321?
	/*
	 *  A. Replace line 6 with System.out.print (--x);  //54321
		B. At line 7, insert x --; //65432
		C. Replace line 5 with while (isAvailable(--x)) { //5432
		D. Replace line 12 with return (x > 0) ? false : true; //nothing
		
		Answer: C
	 * 
	 */
