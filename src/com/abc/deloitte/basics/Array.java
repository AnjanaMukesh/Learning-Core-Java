package com.abc.deloitte.basics;

public class Array {

	public static void main1(String[] args) {
		int a[] = { 2, 4, 1, 0, 4, 8, 3, 6, 7, 9, 3 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void main2(String[] args) {
		Marker[] m;
		m = new Marker[3];
		for (int i = 0; i < m.length; i++) {
			m[i] = new Marker();
			System.out.println(m[i].getPrice());

		}
	}

	public static void main(String[] args) {
		int[][] b;
		b = new int[4][];
		b[0] = new int[2];
		b[1] = new int[4];
		b[2] = new int[3];
		b[3] = new int[1];

		b[0][0] = 12;
		b[0][1] = 15;
		b[1][0] = 16;
		b[1][1] = 20;
		b[1][2] = 36;
		b[1][3] = 84;
		b[2][0] = 37;
		b[2][1] = 21;
		b[2][2] = 22;
		b[3][0] = 16;

		for (int i = 0; i < b.length; i++) {
			System.out.println();
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}

		}

	}
}
