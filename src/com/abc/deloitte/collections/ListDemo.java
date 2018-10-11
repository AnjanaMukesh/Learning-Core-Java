package com.abc.deloitte.collections;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List t1 = new LinkedList();

		t1.add("One");
		t1.add("Two");
		t1.add("Three");
		t1.add(20);
		t1.add("James");
		t1.add("Bosch");
		t1.add("Four");

		System.out.println(t1);

		t1.add(4, "Gosling");
		System.out.println(t1);

		System.out.println(t1.get(4));

		t1.remove(4);
		System.out.println(t1);

		// t1.remove(20);
		t1.remove(new Integer(20));
		System.out.println(t1);

		t1.set(5, "Johnson");
		System.out.println(t1);

	}

}
