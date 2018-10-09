import java.util.Scanner;

public class ControlFlow {

	public static void main1(String[] args) {
		Scanner in = new Scanner(System.in);
		int marks;
		System.out.print("Enter the marks:");
		marks = in.nextInt();
		if (marks >= 75) {
			System.out.println("Distiction");
		} else if (marks >= 60) {
			System.out.println("First Class");
		} else if (marks >= 50) {
			System.out.println("Second class");
		} else if (marks >= 40) {
			System.out.println("Third class");
		} else {
			System.out.println("Fail");
		}

	}

	public static void main2(String[] args) {
		int c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your choice:");
		c = in.nextInt();

		switch (c) {
		case 1:
			System.out.println("Coffee");
			break;
		case 2:
			System.out.println("Tea");
			break;
		case 3:
			System.out.println("Juice");
			break;
		default:
			System.out.println("Water");
		}

	}

	public static void main3(String[] args) {
		int m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the month number:");
		m = in.nextInt();

		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
		case 2:
			System.out.println("28/29 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
		default:
			System.out.println("No match");
		}

	}

	public static void main4(String[] args) {
		int flag = 0;
		for (int i = 2; i <= 50; i++) {
			for (int j = 1; j <= i / 2; j++) {
				if ((i % j) == 0)
					flag++;

			}

			if (flag == 1)
				System.out.print(i + " ");
			flag = 0;

		}
	}

	public static void main5(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(10 + "*" + i + "=" + (i * 10));
			;
			i++;
		}

	}

	public static void main(String[] args) {
		int i = 100;
		do {
			System.out.println(10 + "*" + i + "=" + (i * 10));
		} while (i <= 10);

	}

}
