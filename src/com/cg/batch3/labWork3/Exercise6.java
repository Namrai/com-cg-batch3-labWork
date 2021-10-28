package com.cg.batch3.labWork3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter year");
		int year=sc.nextInt();
		System.out.println("please Enter month");
		int month=sc.nextInt();
		System.out.println("please Enter day");
		int date=sc.nextInt();
		LocalDate givendate =LocalDate.of(year, month, date);
		LocalDate nowdate =LocalDate.now();
		
		Period diff =Period.between(givendate, nowdate);
		System.out.println("differences between two dates are :");
		System.out.println(diff.getYears()+ "years " + diff.getMonths()+" months "+ diff.getDays()+"day");
        sc.close();
	}

}
