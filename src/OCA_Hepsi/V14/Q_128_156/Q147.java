package OCA_Hepsi.V14.Q_128_156;

class Fieldint{
	Character c;
	Boolean b;
	Float f;
	void printAll() {
		System.out.println("c= "+c);//c=
		System.out.println("b= "+b);//b=false
		System.out.println("f= "+f);//f=0.0
	}
	
}

public class Q147 {
	
	
	public static void main(String[] args) {
		char c = 0;
		boolean b = false;
		float fl = 0;

		
		Fieldint f=new Fieldint();
		f.printAll();

		System.out.println(c+":" + b+ ":" +fl);
	}

}
