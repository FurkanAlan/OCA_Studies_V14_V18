package OCA_Hepsi.V18.OCA223_Q1_60.q004;

public class Q004 {

    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        do {                                // Loop steps:
            idx++;                        // 1: idx = 0,   2: idx =1 ,
        } while (idx < size - 1);    // 1: idx =1,  	2: idx =2, (2<2) is false loop ends	--> The top element: 30
        System.out.println("The top element: " + stack[idx]);
    } //do nun ozelligi geregi once degeri aliyor sonra islemi yapiyor, 2<2 false olmasina ragmen 2 degerini alip
    // loop un disina tasidi
}

/*
 * A. 		do {							// Loop steps:
			idx++;						// 1: idx = 0,   
		}while(idx >= size);	// 1: idx =1,  (1>=3) is false loop ends		 --> The top element: 20
		
	B. 									// Loop steps:
			while(idx < size){	// 1: idx = 0,   2: idx =1 ,	3: idx =2. 4: idx = 3     (3<3) is false loop ends	
			idx++;						// 1: idx =1,  	2: idx =2, 	3: idx =3, 		--> ArrayIndexOutOfBoundsException		  
		}
		
	C. 	do {							// Loop steps:
			idx++;						// 1: idx = 0,   2: idx =1 ,
		}while(idx < size-1);	// 1: idx =1,  	2: idx =2, (2<2) is false loop ends	--> The top element: 30
		
	D. 	do {							// Loop steps:
			idx++;						// 1: idx = 0,   2: idx =1 ,	3: idx = 2		4: idx =3
		}while(idx <= size);	// 1: idx =1,  	2: idx =2, 	3: idx =3  	4: idx = 4 (4<=3) is false loop ends	
																													--> ArrayIndexOutOfBoundsException
		
	E. 												// Loop steps:	
			while(idx <= size -1){		// 1: idx = 0,   2: idx =1 ,	3: idx = 2		4: idx =3  (3<=2) is false loop ends
			idx++;								// 1: idx =1,  	2: idx =2, 	3: idx =3  	 --> ArrayIndexOutOfBoundsException		
 */


