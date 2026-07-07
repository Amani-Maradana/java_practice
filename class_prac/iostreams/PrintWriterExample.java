package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter("abc.txt");
			out.print("hai");
			out.println("amani");
			out.write("i am learning");
			out.write(100);
			out.print(100);
			out.flush();
			System.out.println("successful");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		


	}

}
