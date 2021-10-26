package com.cg.batch3.labWork1;

import java.util.Scanner;

//prime numbers
public class Exercise4 {
	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + "It is not a prime Number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0)
					System.out.println(num + "It is not a prime Number");
				flag = 1;
				;
			}
		}
		if (flag == 0) {
			System.out.println(num + "It is a prime Number");
		}
	}
}
