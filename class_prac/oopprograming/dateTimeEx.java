package com.codegnan.oopprograming;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class dateTimeEx {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(" current date :"+date);
		LocalTime time = LocalTime.now();
		System.out.println("current time :"+time);
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println(datetime);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd);
		System.out.println(mm);
		System.out.println(yy);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		System.out.println(ns);
		
		System.out.println("after 6 months "+date.plusMonths(6));
		System.out.println("before 2 days : "+date.minusDays(2));
		
		//creating a new date
		LocalDateTime dt = LocalDateTime.of(2000,Month.MAY,23,11,11,15);
		System.out.println("new date and time : "+dt);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("america/Los_Angles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2004, 10, 9);
		Period p = Period.between(birthday, today);
		System.out.println(p);
		System.out.printf("age is %d years,%d months, %d days.%n",p.getYears(),p.getMonths(),p.getDays());
		
		Date obj = new Date();
		System.out.println(obj);
		System.out.println(obj);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
		String date1 = format.format(obj);
		System.out.println(date1);
		format = new SimpleDateFormat ("dd mm yyyy EEEE" );
		date1 = format.format(obj);
		System.out.println(date1);
		
		

	}

}
