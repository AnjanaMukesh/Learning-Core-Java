package com.abc.deloitte.basics;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		Date d1=new Date();
		Date d2=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		d1.setTime(0);;
		System.out.println(d1);
		
		System.out.println(d2.after(d1));
		System.out.println(d2.before(d1));
		
		
	}

}
