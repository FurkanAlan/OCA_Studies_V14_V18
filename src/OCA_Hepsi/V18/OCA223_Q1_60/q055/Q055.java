package OCA_Hepsi.V18.OCA223_Q1_60.q055;
public class Q055 {
	public static void main(String[] args) {
		int x = 5;
		while (isAvaillable(x)) {
			System.out.println(x);
//			x--;
		}
	}
	public static boolean isAvaillable(int x) {
		return x-- > 0 ? true : false;
	}

}

//Which modification enables the code to print 54321?
//A.	Replace line 6 with System.out. print (--x) ;
//B.	At line 7, insert x --;
//C.	Replace line 6 with --x; and, at line 7, insert System.out.print (x);
//D.	Replace line 12 with return (x > 0) ? false: true;

//Ans - B