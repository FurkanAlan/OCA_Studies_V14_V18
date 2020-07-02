package OCA_Hepsi.V18.OCA223_Q120_180.q120;

class Cart {

	Product p;
	double totalAmount;	 //primitive type
	}
	
class Product {
	String name;
	Double price; //wrapper class, global seviyede tanimlanirsa degeri null olur
}

public class Shop {
	public static void main(String[] args) {
	
		Cart c = new Cart();
		System.out.println(c.p + ":" + c.totalAmount );

		Product prd = new Product();
		System.out.println(prd.name + ":" + prd.price );
	
	}

}
