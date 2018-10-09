package com.abc.deloitte.basics;

public class StringDemo {
	public static void main1(String[] args) {
		String s1 = "Java Programming Language";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(10));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.toUpperCase());
		s1 = s1 + ", created by James Gosling.";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.substring(10));

	}

	public static void main(String[] args) {
		String a = "java";
		String b = "java";
		String d = new String("java");
		b=b+ "language";
		String c = "   a  ";

		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.contains("va"));
		System.out.println(a.startsWith("av"));
		System.out.println(a.startsWith("av", 1));
		System.out.println(a.endsWith("ava"));
		System.out.println(c.trim().isEmpty());
		System.out.println(c.trim());

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(d.hashCode());
		System.out.println();
		
		if(a==d) 
		{
			System.out.println("a & d are same.");
		}
		else{
			System.out.println("a & d are not same.");
		}

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(d));
		System.out.println();
		
		d=d.intern();
		if(a==d) 
		{
			System.out.println("a & d are same.");
		}
		else{
			System.out.println("a & d are not same.");
		}
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(d));
		System.out.println();

	}

}
