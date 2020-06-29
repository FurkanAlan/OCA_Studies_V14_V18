package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

		// store flowers into array
		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower") };

		// store flowers into arraylist
		ArrayList<Flower> flowers = new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));

		
		for (Flower arrayList : flowers) {
			arrayList.bloom();
		}
		System.out.println("==========================");
		
		for (int i = 0; i < flowers.size(); i++) {
			Flower str = flowers.get(i);
			str.bloom();

		}
		System.out.println("-------------------------");
		
		Iterator<Flower> it = flowers.iterator();
		while (it.hasNext()) {
			Flower str = it.next();
			str.bloom();
		}

		// flowers.add("Rose");cannot add String Object into ArrayList of Flower Objects

		// 1. hw to call available methods using: for loop, advanced for loop, iterator
		// 2. hw create food class that will have 3 undefined methods and it will have 4
		// subclasses;
		// create a collection of food and using 3 ways execute methods

		// 3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace
		// it with water.

		// 4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove
		// any number that is divisible by 5 from that arrayList.

		// 5. look over LinkedList and Set Interface
	}
}
