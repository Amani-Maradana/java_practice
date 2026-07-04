package com.codegnan.map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Temp,String> h = new Hashtable<>();
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(3),"C");
		h.put(new Temp(6),"D");
		h.put(new Temp(7),"E");
		System.out.println(h);
	}

}
class Temp{
	int i;
	public Temp(int i ) {
		this.i = i;
	}
	public int hashcode() {
		return i;
	}
	public String toString() {
		return i+ " ";
	}
}
