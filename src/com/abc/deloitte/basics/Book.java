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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNo_of_pages() {
		return no_of_pages;
	}

	public void setNo_of_pages(int no_of_pages) {
		this.no_of_pages = no_of_pages;
	}

	public int getCur_page() {
		return cur_page;
	}

	public void setCur_page(int cur_page) {
		this.cur_page = cur_page;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws IllegalArgumentException {
		if (price > 0)
			this.price = price;

		else {
			throw new IllegalArgumentException("Invalid price:" + price);

		}
	}

	public String getTITLE() {
		return TITLE;
	}

	public String getAUTHOR() {
		return AUTHOR;
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
