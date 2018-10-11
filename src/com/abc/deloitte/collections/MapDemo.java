package com.abc.deloitte.collections;

import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;

public class MapDemo {

	public static void main1(String[] args) {
		Map m1 = new HashMap();

		System.out.println(m1.isEmpty());
		System.out.println(m1.size());

		m1.put("James", "Gosling");
		m1.put("java", 1996);
		m1.put("sea", 1971);
		m1.put("Codd", "Oracle");

		System.out.println(m1);
		System.out.println(m1.containsKey("John"));
		System.out.println(m1.containsKey("java"));
		System.out.println(m1.containsKey("Gosling"));
		System.out.println(m1.containsKey(1971));

		System.out.println(m1.get("java"));
		Set keys = m1.keySet();
		System.out.println(keys);

		Collection values = m1.values();
		System.out.println(values);

	}

	public static void main(String[] args) {
		SortedMap m1 = new TreeMap();

		System.out.println(m1.isEmpty());
		System.out.println(m1.size());

		m1.put("James", "Gosling");
		m1.put("java", 1996);
		m1.put("sea", 1971);
		m1.put("Codd", "Oracle");
		System.out.println(m1);

		Map m2 = m1.headMap("java");
		System.out.println(m2);
	}

}
