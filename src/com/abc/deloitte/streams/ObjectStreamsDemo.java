package com.abc.deloitte.streams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ObjectStreamsDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\admin\\Desktop\\Anjana\\JAVA\\test.txt"));
			out.writeObject(c1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (Objects.nonNull(out)) {
				try {
					out.close();
				} catch (IOException ioe) {

				}
			}

		}
	}

	public static void main1(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\Anjana\\JAVA\\test.txt"));

			Car t = (Car) in.readObject();
			System.out.println(t.getPrice());
			System.out.println(t.getEngine().getType());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(in)) {
				try {
					in.close();
				} catch (IOException ioe) {

				}
			}

		}
	}
}