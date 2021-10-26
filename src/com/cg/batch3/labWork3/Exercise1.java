package com.cg.batch3.labWork3;

import java.util.Scanner;
import java.util.*;

public class Exercise1 { 
	public static void main(String[] args) {
		int num ;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer seperated by coma ");
		String s =sc.nextLine();
		StringTokenizer st = new StringTokenizer(s,",");
		
		while(st.hasMoreTokens()) {
			String temp =st.nextToken();
			num =Integer.parseInt(temp);
			System.out.println(num);
			sum = sum + num ;
			
		}
		System.out.println("SUM of integers is " + sum);
		sc.close();
	}
	
}
