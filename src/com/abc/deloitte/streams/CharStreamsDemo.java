package com.abc.deloitte.streams;

import java.io.FileReader;
import java.util.Objects;
import java.io.IOException;

public class CharStreamsDemo {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\Users\\admin\\Desktop\\Anjana\\HTML\\Text.txt");
			int t;
			while ((t = in.read()) != -1) {
				System.out.print((char) t);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
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
