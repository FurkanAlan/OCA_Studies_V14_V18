package OCA_Hepsi.V18.OCA223_Q120_180.q126;

public class Q126 {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;
        // line n1

//A.
//        while (x > 0) {
//            x--;  //Decrement oldugu icin reverse print ediyor
//            System.out.print(array[x]);
//        }

//B.
        do {
            x--;
            System.out.print(array[x]);//ArrayIndexOutOfBoundsException
            //Index -1 out of bounds for length 5, do nun ozelligi aldigi sayiyi sout a iletiyor
            // array[x] = java.lang.IndexOutOfBoundsException : Invalid array range: 5 to 5, zaten ilk aldigi degerde
            // bile hata veriyor
            //array.length = 5
        } while (x >= 0);


//C.
//	 while (x>=0) {    // ArrayIndexOutOfBoundsException
//	System.out.print(array[x]); 
        //Index 5 out of bounds for   length 5
//	x--;
//	}

//D.

//	do {
//	System.out.print(array[x]);// rrayIndexOutOfBoundsException
//	--x;                   //Index 5 out of bounds for length 5
//	}while (x>=0);
//	
//E.
//        while (x > 0) {
//            System.out.print(array[--x]);
//
//            //Answer A ve E print eder ve 50 40 30 20 10 reverse olarak
//        }

    }
}