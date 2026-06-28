package com.codegnan.oopprograming;
import java.util.Scanner;
public class doctorappo extends appointment{
public void schedule() {
	Scanner sc = new Scanner(System.in);
	System.out.print("specialization : ");
	String spec = sc.next();
	System.out.println("Doctor.appointment.scheduled.for."+spec);
}
}
