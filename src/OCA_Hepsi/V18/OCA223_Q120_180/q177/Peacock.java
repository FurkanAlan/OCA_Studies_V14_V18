package OCA_Hepsi.V18.OCA223_Q120_180.q177;

class Bird {
    public void fly() {
        System.out.println("Fly.");
    }
}

public class Peacock extends Bird {
    public void dance() {
        System.out.println("Dance.");

    }

    /* insert code snippet here */
    public static void main(String[] args) {
//A
//        Bird p = new Peacock();

//B, bu hata verecek cunku ilk olarak bird parent, parent objesi var bunun uzerinden islem var,
//        Bird b = new Bird();
//        Peacock p = (Peacock) b; //Casting 'b' to 'Peacock' will produce 'ClassCastException'
        //casting de yukaridan asagi yapildiginda sorun yok lakin asagidan yukariya yapilirsa Cast hatasi veriyor

//C, burada da child objesi var
//        Peacock b = new Peacock();
//        Bird p = (Bird)b;

//D	==> dogru cevap
        Bird b = new Peacock();         //======>|| B -> P
        Peacock p = (Peacock) b;        //       ||
                                        //   <===== P -> (P)  P   //b Bird variable ancak referans oldugu nokta
        //   Peacock , burada eger extend olmasaydi hata verirdi

//        Bird b;
//        b = new Peacock();
//        Peacock p;
//        p = (Peacock) b;

        p.fly();
        p.dance();
    }


    //Which code snippet can be inserted to print Fly.Dance. ?

}
	