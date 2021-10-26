package com.cg.batch3.labWork1;

import java.util.Scanner;

//difference between the sum of the squares and the square of the sum 
public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("DIFF OF SUM OF SQR AND SQR OF SUM " + "" + calculateDifference(num));
		sc.close();
	}

	public static double calculateDifference(int n) {
		double n1, n2, diff;
		n1 = (n * (n + 1) * (2 * n + 1)) / 6;// sum of the square of n natural number
		n2 = (n * (n + 1)) / 2;// sum of n natural number
		n2 = n2 * n2;
		diff = Math.abs(n1 - n2);
		return diff;
	}
}
