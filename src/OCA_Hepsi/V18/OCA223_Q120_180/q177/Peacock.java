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

//B, bu hata verecek cunku ilk olarak bird parent, parent objesi var bunun uzerinden islem var
//        Bird b = new Bird();
//        Peacock p = (Peacock) b;

//C, burada da child objesi var
//        Peacock b = new Peacock();
//        Bird p = (Bird) b;

//D	==> dogru cevap
        Bird b = new Peacock();
        Peacock p = (Peacock) b;

        p.fly();
        p.dance();
    }


    //Which code snippet can be inserted to print Fly.Dance. ?

}
	