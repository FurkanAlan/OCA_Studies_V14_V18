package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {

	public static void main(String[] args) {
		
		Map<Integer, String> building=new LinkedHashMap<>();
		//Entries with duplicate keys and values;
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(7, "Oracle");
		
		String element=building.get(2);
		System.out.println(element+"-----------------------");
		
		System.out.println(building.size());
		System.out.println(building);
		
		//how to get all keys
		Set<Integer> keys=building.keySet();
		System.out.println(building.keySet());//print set
		
		System.out.println("--- getting keys using iterator ---- ");
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			//key is 1 and its value is Google
			System.out.println("Key is "+key+" its value is "+building.get(key));
		}
		
		System.out.println("--- getting keys using for each loop ---- ");
		for(int k:keys) {
			System.out.println("Key from building map= "+k+":"+building.get(k));
		}

		//how to get all values
		Collection<String> values=building.values();//Iterable=collection
		
		System.out.println("--- getting all values using for each loop ---- ");
		for(String v:values) {
			System.out.println("Value from collection "+v);
		}
		
		System.out.println("--- getting all values using iterator ---- ");
		Iterator<String> valuesIt=values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println("Map values: "+valuesIt.next());
		}
	}
}
