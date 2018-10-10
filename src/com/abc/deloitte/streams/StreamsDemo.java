package com.abc.deloitte.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class StreamsDemo {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out=null;
		try {

			in = new FileInputStream("C:\\Users\\admin\\Desktop\\Anjana\\HTML\\Text.txt");
			out=new FileOutputStream("C:\\Users\\admin\\Desktop\\Anjana\\HTML\\Text1.txt");
			int t;
			while ((t = in.read()) != -1) {
				System.out.print((char) t);
				out.write(t);
			}

		}

		catch (FileNotFoundException fnfe) {
		} catch (IOException ioe) {
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {

				}
			}
		}

	}
}
