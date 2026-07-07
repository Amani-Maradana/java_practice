package com.codegnan.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderExample {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
String line;
try {
	while((line = br.readLine())!=null) {
		System.out.println(line);
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
