import java.util.Scanner;
import java.util.Calendar;

public class Methods {

	public static long fact(int n) { // parameter and return type
		int i = n;
		long f = 1;
		for (; i > 1; i--) {
			f = f * i;
		}
		return f;

	}

	public static void factorial(int n) { // parameter with no return type
		int i = n;
		long f = 1;
		for (; i > 1; i--) {
			f = f * i;
		}
		System.out.println("Factorial :" + f);

	}

	public static void printLine() { // no parameter and no return type
		System.out.println("------------------------------");
	}

	public static int today() { // no parameter with return type
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.DATE);
	}

	public static void main(String[] args) {
		int num1, num2;
		long f;
		Scanner in = new Scanner(System.in);
		System.out.println("Today is " + today());
		System.out.print("Enter the number:");
		num1 = in.nextInt();

		System.out.println("Factorial:" + fact(num1));
		printLine();
		System.out.print("Enter the number:");
		num2 = in.nextInt();
		factorial(num2);
		printLine();

	}

}
