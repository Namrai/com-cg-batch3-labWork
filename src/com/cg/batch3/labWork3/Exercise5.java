package com.cg.batch3.labWork3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

	static boolean isOrder(String s) {
		int n =s.length();
		char[] ch =new char[n];
		for(int i =0;i<n;i++)
		{
			ch[i] =s.charAt(i);
		}
		Arrays.sort(ch);
		for(int i=0;i<n;i++)
		{
			if(ch[i]!=s.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String s =sc.nextLine();
		if(isOrder(s))
		System.out.println("postive String");
		else
	    System.out.println("Negative String");
		sc.close();
	}
}
