package OCA_Hepsi.V18.OCA223_Q120_180.q151;

public class Question151 {
}

class Alpha {

    int ns;
    static int s;

    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}

class TestA {
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(100);
//        ref1.doPrint();
        Alpha ref2 = new Alpha(50);
//        ref2.doPrint();
        Alpha ref3 = new Alpha(125);
//        ref3.doPrint();

//        System.out.println(ref1.ns);
//        System.out.println(ref1.s);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

//What is the result?
//A
//		            ns = 100   s = 125
//		            ns = 0  s = 125
//		            ns = 125  s = 125

//B
//		            ns = 50  s = 50
//		            ns = 125  s = 125
//		            ns = 0  s = 125

//C
//		            ns = 50  s = 125
//		            ns = 125  s = 125
//		            ns = 0  s = 125

//D
//		            ns = 50  s = 50
//		            ns = 125  s = 125
//		            ns = 100  s = 100

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer: A


//second version

//class Alpha{
//
//   static int ns;
//		    int s;
//
//		    Alpha(int ns){
//		        if(s<ns){
//		            s = ns;
//		            this.ns = ns;
//		        }
//		    }
//		    void doPrint(){
//		        System.out.println("ns = "+ns+" s = "+s);
//		    }
//}
//class TestA{
//		    public static void main(String[] args) {
//		        Alpha ref1 = new Alpha(50);
//		        Alpha ref2 = new Alpha(100);
//		        Alpha ref3 = new Alpha(125);
//
//		        ref1.doPrint();
//		        ref2.doPrint();
//		        ref3.doPrint();
//		    }
//
//}