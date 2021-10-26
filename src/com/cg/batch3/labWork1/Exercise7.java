package com.cg.batch3.labWork1;

import java.util.Scanner;

//Create a method to check if a number is an increasing number
public class Exercise7 {

	public static void main(String[] args) {
		int num;
		System.out.println("enter your number to find it is increasing num  or not ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		checkNumber(num);
		sc.close();
	}

	public static void checkNumber(int n) {
		boolean flag = false;
		int digit = n % 10;
		n = n / 10;

		while (n > 0) {
			if (digit <= n % 10) {
				flag = true;
				break;
			}
			digit = n % 10;
			n = n / 10;
		}
		if (flag) {
			System.out.println(" your number is not  an increasing num ");
		} else {
			System.out.println(" your number is an increasing num ");
		}
	}

}
