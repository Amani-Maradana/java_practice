package com.codegnan.oop;

public class box {
	
double width;//instance variables
double height;
double depth;
//instance method
public void volume() {
	System.out.println("box height: "+height);
	System.out.println("box width: "+width);
	System.out.println("box depth: "+depth);

	double volume = width*height*depth;
	
	System.out.println("box voume is : "+volume);
}

public static void main(String[] args) {
	box mybox1 = new box();
	mybox1.volume();
	box mybox2 = new box();
	mybox2.height = 10.0;
	mybox2.width = 10.0;
	mybox2.depth = 10.0;
	mybox2.volume();
	
}


}
