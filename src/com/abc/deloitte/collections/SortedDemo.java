package com.abc.deloitte.collections;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.abc.deloitte.basics.Marker;

public class SortedDemo {
	public static void main1(String[] args) {
		Set  s1=new TreeSet();
		
		s1.add("James");
		s1.add("Johnson");
		s1.add(1996);
		
		System.out.println(s1);
	}
	
	public static void main2(String[] args) {
		Set  s1=new LinkedHashSet();
		
		s1.add("James");
		s1.add("Johnson");
		s1.add(1996);
		
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		Marker m1=new Marker();
		Marker m2=new Marker();
		
		System.out.println(m1);
		System.out.println(m2);
		Set s1= new TreeSet();
		s1.add(m1);
		s1.add(m2);
		System.out.println(s1);
		
		
	}

}
