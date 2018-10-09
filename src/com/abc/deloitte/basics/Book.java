package com.abc.deloitte.basics;

public class Book {
	final String TITLE;
	final String AUTHOR;
	String publisher;
	int no_of_pages;
	int cur_page;
	private double price;

	public Book(String t, String a, String p, int n, int c, double pr) {
		TITLE = t;
		AUTHOR = a;
		publisher = p;
		no_of_pages = n;
		cur_page = c;
		price = pr;
	}

	public void getBook() {
		System.out.println("Title:" + TITLE);
		System.out.println("Author:" + AUTHOR);
		System.out.println("Publisher:" + publisher);
		System.out.println("No of pages:" + no_of_pages);
		System.out.println("Current page:" + cur_page);

	}

	public void open() {
		cur_page = 1;
		
	}

	public int close() {
		int temp = cur_page;
		cur_page = 0;
		return temp;
	}

	public int open(int c) {
		cur_page = c;		
		return c;

	}

	public void turnLeft() {
		if (cur_page != 1) {
			cur_page--;
			System.out.println("Page is turned left.");
		} else {
			System.out.println("Pages cannot be turned left.");

		}
	}

	public void turnRight() {
		if (cur_page != no_of_pages) {
			cur_page++;
			System.out.println("Page is turned right.");
		} else {
			System.out.println("Pages cannot be turned right.");

		}
	}

	public boolean isOpen() {
		if (cur_page != 0) {
			return true;
		} 
			return false;
		
	}

	public boolean isClose() {
		if (cur_page == 0) {
			return true;
		} 
			return false;
		
	}

}
