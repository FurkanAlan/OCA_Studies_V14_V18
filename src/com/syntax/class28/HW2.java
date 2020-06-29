package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();

		for (int x = 0; x <= 50; x += 2) {
			nums.add(x);
		}

		System.out.println(nums);

		Iterator<Integer> n = nums.iterator();
		
		while (n.hasNext()) {
			if (n.next() % 5 == 0) {
				n.remove();
			}
		}
		
		System.out.println(nums);
	}

}
