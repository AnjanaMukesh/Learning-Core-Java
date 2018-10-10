package com.abc.deloitte.streams;
import java.util.Objects;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferStreamsDemo {

	public static void main(String[] args) {
		BufferedReader in=null;
		try {
			in = new BufferedReader("C:\\Users\\admin\\Desktop\\Anjana\\HTML\\Text.txt");
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
