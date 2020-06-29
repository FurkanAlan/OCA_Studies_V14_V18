package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		//lets arraylist that stores Double type of objects
		//1. generic collection / arraylist
		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		//alist.add(100);
		//alist.add("Hello");
		System.out.println(alist);
		
		//replace element
		alist.set(1, 13.90);
		System.out.println(alist);
		
		//remove element
		alist.remove(13.90);
		System.out.println(alist);
		
		//retrieve single element
		System.out.println(alist.get(1));
		
		//retrieve all elements from collection
		//1. use advanced/enhanced for loop
		for(double a:alist) {
			System.out.println(a);
		}
		
		//2. for loop
		for(int i=0; i<alist.size(); i++) {
			double d=alist.get(i);
			System.out.println(d);
		}
		
		//3. Iterator
		Iterator<Double> iterator=alist.iterator();
		while(iterator.hasNext()) {
			double d=iterator.next();
			System.out.println(d);
		}
		
		System.out.println(" ----   Non generic collection ------- ");
		
		//2. non generic collection/ arraylist
		ArrayList obj=new ArrayList();
		obj.add("hello");//store single object
		obj.add(100);
		obj.add('c');
		obj.addAll(alist);//store collection object
		
		System.out.println(obj);
		
		//retrieve all elements from collection
		for(Object o:obj) {
			System.out.println(o);
		}
	}
}
