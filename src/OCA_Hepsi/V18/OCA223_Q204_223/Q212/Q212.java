package OCA_Hepsi.V18.OCA223_Q204_223.Q212;

interface I1 {
}

class P1 {
}

class P2 extends P1 implements I1 {
}
//and the given code

public class Q212 {
    public static void main(String[] args) {
        P1 obj = new P1();
        P2 obj2 = new P2();
        I1 obj3 = new P2();
        boolean r1 = obj instanceof P2;    //'obj' was assigned to P1, P1 P2 nin altinda yer alan bir sinif degildir
        boolean r2 = obj2 instanceof P1;  //Variable is already known to be P2 (child) which is a subtype of P1 (parent)
        boolean r3 = obj3 instanceof I1;  //Variable type is I1
        System.out.println(r1 + ":" + r2 + ":" + r3);
    }/*
    What is the result?
    A. true:false:true
    B. false:true:true
    C. false:true:false
    D. true:true:false
     Answer: B
    */
}