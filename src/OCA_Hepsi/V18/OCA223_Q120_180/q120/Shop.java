package OCA_Hepsi.V18.OCA223_Q120_180.q120;

class Cart {

	Product p;
	double totalAmount;	
	}
	
class Product {
	String name;
	Double price;
}

public class Shop {
	public static void main(String[] args) {
	
		Cart c = new Cart();
		System.out.println(c.p + ":" + c.totalAmount );

		Product prd = new Product();
		System.out.println(prd.name + ":" + prd.price );
	
	}

}
