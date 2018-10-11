package com.abc.deloitte.basics;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Algorithms {
	public static void main(String[] args) {
		List t1 = new ArrayList();

		t1.add(56);
		t1.add(49);
		t1.add(67);
		t1.add(34);
		t1.add(9);
		t1.add(60);
		t1.add(12);
		t1.add(34);
		t1.add(23);
		t1.add(54);

		System.out.println(t1);

		// Collections.sort(t1);
		// Collections.shuffle(t1);
		// Collections.rotate(t1,4);
		// Collections.reverse(t1);
		Collections.swap(t1, 6, 3);
		System.out.println(t1);

		System.out.println(Collections.max(t1));
		System.out.println(Collections.min(t1));

	}

}
