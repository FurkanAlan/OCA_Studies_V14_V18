package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Yunus"); // comes from Collection
		llist.add(0, "Reyhan");// comes from List
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");

		int size = llist.size();
		System.out.println(size);

		// get all elements 1 by 1 in 3 different ways
		for (int x = 0; x < llist.size(); x++) {
			System.out.println(llist.get(x));
		}

		for (String a : llist) {
			System.out.println(a);
		}

		Iterator<String> it = llist.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//can we store objects of user defined classes?
		List<Food> food=new LinkedList<>();
		food.add(new Salad("salad", "tomato and cucumber", 100));
		food.add(new Dessert("desert", "chocolate", 1000));
		food.add(new MainDish("pasta", "mushrooms", 800));
		food.add(new MainDish("pasta", "mushrooms", 800));
		
		for(Food f:food) {
			f.calories();
			f.foodType();
			f.ingredient();
			
			System.out.println("---------------");
		}
	}
}
