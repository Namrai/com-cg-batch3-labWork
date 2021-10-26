package com.cg.batch3.labWork1;

import java.util.Scanner;

//sum of first n natural numbers which are divisible by 3 or 5.
public class Exercise5 {
	static int s1, s2, s3;

	public static void main(String[] args) {
		System.out.println("enter the nth term for which you want to find sum");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("sum of" + n + "number is :" + calculateSum(n));
		sc.close();
	}

	public static int calculateSum(int num) {
		s1 = (num / 3) * (2 * 3 + (num / 3 - 1) * 3) / 2;
		s2 = (num / 5) * (2 * 5 + (num / 4 - 1) * 5) / 2;
		s3 = (num / 15) * (2 * 15 + (num / 15 - 1) * 15) / 2;
		return s1 + s2 + s3;
	}
}
