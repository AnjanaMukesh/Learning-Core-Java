import java.util.Scanner;
import java.lang.Math;

public class OperatorsDemo {

	public static void main(String[] args) {

		int a, i;
		double k = 2, s = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Number:");
		a = in.nextInt();
		for (i = a; i > 0; i /= 10) {
			/*
			 * if(i%2==0) s+=i%10; s=s+(i%10)*Math.pow(10,k); k--;
			 */

			if (i % 2 != 0)
				s += i % 10;

			// s+=i%10;
		}
		System.out.println(s);
	}
}
