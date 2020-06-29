package OCA_Hepsi.V18.OCA223_Q86_107;

public class Q93 {
}
	class Productt{
	int id;
	String name;
	
	public  Productt(int id, String name) { //void soruda yok
		this.id = id;
		this.name = name;
	}

	
    public static void main(String[] args) {
		
	
 //And given the code fragment:
	Productt p1 = new Productt (101, "Pen");
	Productt p2 = new Productt (101, "Pen");
	Productt p3 = p1;
	boolean ans1 = p1==p2;
	boolean ans2 = p1.name.contentEquals(p2.name);
	System.out.println(ans1 + ":"+  ans2);
	
    }
}
	/*
	 * What is the result?
		A. true:true
		B. true:false
		C. false:true
		D. false:false
		
		Answer: C
	 */
	
	