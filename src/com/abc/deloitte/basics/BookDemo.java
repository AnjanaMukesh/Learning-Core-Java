package com.abc.deloitte.basics;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		int c;
		char ch;
		Scanner in = new Scanner(System.in);
		Book b1 = new Book("Da Vinci Code", "Dan Brown", "Harper & Colins", 845, 0, 565.50);
		Book b2 = new Book("Murder at Orient Express", "Agatha Christie", "Johnson", 290, 10, 350.50);

		System.out.println("Enter your choice: \n" + " 1:Get information about book \n " + "2:Open book \n "
				+ "3:Close book \n " + "4:Open book from the current page \n " + "5:Is book open \n "
				+ "6:Is book closed \n " + "7:Turn page left \n" + " 8:Turn page right");

		do {
			System.out.print("Enter your choice:");
			c = in.nextInt();
			switch (c) {
			case 1:
				b1.getTITLE();
				b1.getAUTHOR();
				b1.getNo_of_pages();
				b1.getPrice();
				b1.getCur_page();

			case 2:
				b1.open();
				System.out.println("Book is opened.");
				break;

			case 3:
				b1.close();
				System.out.println("Book is closed.");
				break;

			case 4:
				b1.open(b1.close());
				System.out.println("Current page is " + c);
				break;

			case 5:
				if (b1.isOpen()) {
					System.out.println("Book is open.");
				} else {
					System.out.println("Book is not open.");
				}
				break;

			case 6:
				if (b1.isClose()) {
					System.out.println("Book is closed.");
				} else {
					System.out.println("Book is not closed.");
				}
				break;

			case 7:
				b1.turnLeft();
				break;

			case 8:
				b1.turnRight();
				break;

			}
			System.out.println("Do you want to continue?(Y/N)");
			ch = in.next().charAt(0);
		} while (ch != 'N');

	}
}
