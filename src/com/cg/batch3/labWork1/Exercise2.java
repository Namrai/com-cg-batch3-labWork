package com.cg.batch3.labWork1;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) 
		// Write a java program that simulates a traffic light
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guidances of traffic light");
		System.out.println("--------------------------------");
		System.out.println("Enter 1 for RED light");
		System.out.println("Enter 2 for GREEN light");
		System.out.println("Enter 3 for YELLOW ligh");
		System.out.println("--------------------------------");
		System.out.println("Enter the value to know the guidline of the ligts");
		int light  = sc.nextInt();
		switch(light)
		{
		case 1:System.out.println("red light say to STOP !");
			break;
		case 2:System.out.println("green  light say to Go **");
			break;
		case 3:System.out.println("yellow light say to BE READY ^^");
			break;
		default :System.out.println(" < Invaild option >");
		  break;
		}
		sc.close();
	}
}

