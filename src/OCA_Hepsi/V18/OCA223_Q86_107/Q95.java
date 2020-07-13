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
		lst.add(new Product(10, "IceCream")); //1st deil 1st. hata verince lst cevirdim.
		lst.add(new Product(11, "Chocolate"));
		Product p1 = new Product(10, "IceCream"); //burada assign edilmedigi icin p1 den dolayi herhangi birsey yok
		// eklenmedi, add yapilmadigi icin

//		lst.add(p1);

//		System.out.println(p1.id);

		System.out.println(lst.indexOf(p1));
//		Returns the index of the last occurrence of the specified element
//     in this list, or -1 if this list does not contain the element.

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
