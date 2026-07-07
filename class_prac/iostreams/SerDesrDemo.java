package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		try(FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			Employee emp=new Employee(101,"appu",52220);
			oos.writeObject(emp);
			System.out.println("Serializable ended");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("abc.ser");
			    ObjectInputStream ois = new ObjectInputStream(fis))
			{
			    Employee employee = (Employee) ois.readObject();
			    System.out.println("De-Serializable ended");
			    System.out.println(employee);
			}
			catch(FileNotFoundException e)
			{
			    e.printStackTrace();
			}
			catch(IOException e)
			{
			    e.printStackTrace();
			}
			
	}
}