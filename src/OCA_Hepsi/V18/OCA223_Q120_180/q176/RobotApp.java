package OCA_Hepsi.V18.OCA223_Q120_180.q176;

interface Speakable {
    public void speak(String s);
}

abstract class Robot implements Speakable {
    public abstract void process(); //Bu method abstract olmali cunki abstract class must have abstract method
}                           //public abstract void process();--> Helping... Done print eder(answer
class Humanoid extends Robot {

    public void process() {
        System.out.println("Helping... ");
    }
    public void speak(String s) {
        System.out.println(s);
    }
}
public class RobotApp {

    public static void main(String[] args) {

        Robot r = new Humanoid();
        r.process();  //r ifadesi Robot class indan bir elamandir, isin onemli tarafi r.process() Robot sinifinda yer
        // alan bir metod olmasina ragmen class Humanoid den bize veri saglayip oradan Helping kismini cagiriyoruz,
        // eger extend olmasaydi bunu yapamazdi, diger bir hususta olusturulan r referans noktasi Humanoid classina
        // gidiyor ve Robot sinifinda olusturulmus
		//Robot r = new Humanoid(); ve Humanoid r = new Humanoid(); bize ayni sonuclari veriyor
		//Robot r = new Humanoid(); bu sekilde oldugunda r.process(); bizi abstract Robot sinifina goturuyor ve buyuk
		// ihtimalle bu metod implment yapildigi icin class Humanoid den de degerinni aliyor lakin
		//Humanoid r = new Humanoid(); olsa direk Humanoid sinifindan .process(); metodunu cagiracak
        r.speak("Done");
    }
}

//Ans = C
//replace public void process();
//with public abstract void process();
//cunku public void process(); ==> body lazim , {} olmali metod dan sonra lakin olmadigi icin diger yol olan absract
// anahhar kelimesi kullanilmali