package com.abc.deloitte.basics;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// Calendar c1=new Calendar();
		Calendar c1 = Calendar.getInstance();
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));

		c1.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_YEAR) + 72);
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		

	}
}