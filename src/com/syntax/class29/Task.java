package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		
		Set <String> countries = new TreeSet<>();
		countries.add("Afghanistan");
		countries.add("Monaco");
		countries.add("Bahrain");
		countries.add("Oman");
		countries.add("Chile");
		countries.add("Poland");
		countries.add("Djibouti");
		countries.add("Cuba");
		countries.add("Slovakia");
		
		for (String country:countries) {
			System.out.print(country+", ");
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		Iterator <String> country = countries.iterator();
		while(country.hasNext()) {
			System.out.print(country.next()+ ", ");
		}
		System.out.println();
		System.out.println("****************************************************************************");
		
		Set <String> cities = new LinkedHashSet<>();
		
		cities.add("Charles City");
		cities.add("Franklin");
		cities.add("Abingdon");
		cities.add("Farmville");
		cities.add("Ashland");
		cities.add("Wintergreen");
		cities.add("Richmond");
		
		System.out.println(cities);
		Iterator <String> city = cities.iterator();
		
		while (city.hasNext()) {
			
			if (city.next().toLowerCase().startsWith("a"))
				city.remove();
		}
		
		System.out.println(cities);
		System.out.println("*********************************************************************");
	}
}
