package OCA_Hepsi.V18.OCA223_Q1_60.q009;

class CD {
    int r;

    CD(int r) {
        this.r = r;
    }


//    CD() {
//    }
}

public class DVD extends CD {
    int c;

    DVD(int r, int c) {
        // line n1
		super(r);  //bunun manasi parent e git ve oradaki tek parametreli olan contructor u kullan ve parametre
        // degerini de r olarak kullan => 10
//        super.r = r;  //bunun olabilmesi icin bizim CD class inda bos bir constructor umuz olmali
        this.c = c;
    }

    public static void main(String[] args) {
        DVD dvd = new DVD(10, 20);
        System.out.println(dvd.c+  " : " + dvd.r);
    }
}
/*
Which code fragment should you use at line n1 to instantiate the dvd object successfully?
A. super.r = r;		// super.r is not correct way to call parent class's constructor
	this.c = c;
	
B. super(r);
	this(c);				// this(); should be the first statement right after constructor
	
C. super(r);
	this.c = c;
	
D. this.c = r;
	super(c);        	// super(); should be the first statement right after constructor

*/