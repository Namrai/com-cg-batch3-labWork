package com.cg.batch3.labWork9;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		
		Demo1 obj = () ->{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enter x and y values:");
			 sc.close();
	     return (long) Math.pow(sc.nextInt(), sc.nextInt());
		};
		System.out.println("x power y is: "+obj.powerOfX());
	}
	}

