package OCA_Hepsi.V18.OCA223_Q120_180.q176;

interface Speakable {
	public void speak(String s);
}

abstract class Robot implements Speakable {
	public abstract void process(); //Bu method abstract olmali cunki abstract class must have abstract method
}                           //public abstract void process();--> Helping... Done print eder(answer

class Humanoid extends Robot {

	public void process () {
		System.out.println("Helping... ");
	}

	public void speak (String s) {
		System.out.println(s);
	}
}

public class RobotApp {

	public static void main(String[] args) {
	
		Robot r = new Humanoid();
		r.process();
		r.speak("Done");
	
	}

}

//Ans = C
//replace public void process();
//with public abstract void process();
//cunku public void process(); ==> body lazim , {} olmali metod dan sonra lakin olmadigi icin diger yol olan absract
// anahhar kelimesi kullanilmali