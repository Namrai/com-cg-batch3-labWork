package com.cg.batch3.labWork1;
import java.util.Scanner;

//Create a method to check if a number is a power of two or not
public class Exercise8 {

	public static void main(String[] args) 
	  {
		System.out.println("Enter your number if its power of 2 it will give TRUE else False ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println(powerOfTwo(n1));
		sc.close();
		}
	public static boolean powerOfTwo(int num)
	{
		if (num<=0)
		{
			return false;
		}
		while(num>1) 
		{
			if(num%2!=0) 
			{
				return false;
			}
			num=num/2;
		}
		return true;
	}

}

