package OCA_Hepsi.V18.OCA223_Q86_107;

import java.util.*;

public class Q95 {

}
class Product{
	int id;
	String name;
	
	public  Product(int id, String name) { 
		this.id = id;
		this.name = name;
	}
}
class Shop {

	public static void main(String[] args) {
		
		List<Product> lst = new ArrayList<>() ;
		lst.add(new Product(10, "IceCream")); //st deil 1st. hata verince st cevirdim.
		lst.add(new Product(11, "Chocolate"));
		Product p1 = new Product(10, "IceCream");

		//lst.add(p1);
		System.out.println(p1.id);
		System.out.println(lst.indexOf(p1));

//			System.out.println(lst.get(0).name);
			
		}
	}

/*
 *What is the result?
		A. true
		B. false
		C. -1
		D. 0
		Answer: C 
 */
