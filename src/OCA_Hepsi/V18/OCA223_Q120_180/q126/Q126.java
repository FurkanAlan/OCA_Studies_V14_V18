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
            //5040302010Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
            // Problem aslinda 5--,  4 (yani 4. indexe git diyor System.out.print(array[4]) ) oluyor bu sekilde
            // gidiyor lakin 1--, 0. indexi yazdirdiktan sonraki adimda problem oluyor,
            // cunku sayi 1--;  0 oluyor while(0>=0) bu sarti sagliyor bundan dolayi loop bi daha
            // donecek 0--; yani -1 icin, System.out.print(array[-1]); herhangi bir deger olmadigi icin
            // ArrayIndexOutOfBoundsException hatasi veriyor

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