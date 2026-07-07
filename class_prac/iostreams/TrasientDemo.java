package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TrasientDemo {

	public static void main(String[] args) {
		ATMCard originalCard = new ATMCard(123345,343,"12/31",8743,"amani");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("atm.ser"))){
			oos.writeObject(originalCard);
			System.out.println("Object serialized : "+originalCard);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		ATMCard deserializedCard = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("atm.ser "))){
			try {
				deserializedCard = (ATMCard)ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("de-serialized card : "+deserializedCard);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
