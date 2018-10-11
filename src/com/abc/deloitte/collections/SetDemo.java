package com.abc.deloitte.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main1(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("One");
		h1.add("Two");
		h1.add("Three");
		h1.add("Four");
		System.out.println(h1);

		Iterator it = h1.iterator();
		while (it.hasNext()) {
			String temp = (String) it.next();
			System.out.println(temp);

			if (temp.equals("Three")) {
				it.remove();
			}
		}
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		h1.clear();
		System.out.println(h1.isEmpty());

	}

	public static void main2(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("One");
		h1.add("Two");
		h1.add("Three");
		h1.add("Four");
		System.out.println(h1);

		HashSet h2 = new HashSet();
		h2.add("Eight");
		h2.add("Two");
		h2.add("Five");
		h2.add("Three");
		System.out.println(h2);

		System.out.println();

		// h1.addAll(h2);
		// h1.removeAll(h2);
		h1.retainAll(h2);
		System.out.println(h1);
		System.out.println(h1.containsAll(h2));
		h1.remove("Two");
		System.out.println(h1);

		Object[] ta = h2.toArray();
		for (int i = 0; i < ta.length; i++) {
			System.out.println(ta[i]);
		}

	}

	public static void main3(String[] args) {
		LinkedHashSet lh1 = new LinkedHashSet();
		lh1.add("One");
		lh1.add("Two");
		lh1.add("Three");
		lh1.add("Four");
		System.out.println(lh1);
	}

	public static void main(String[] args) {
		Set s1 = new TreeSet();
		s1.add("One");
		s1.add("Two");
		s1.add("Three");
		s1.add("Four");
		System.out.println(s1);

	}
}
