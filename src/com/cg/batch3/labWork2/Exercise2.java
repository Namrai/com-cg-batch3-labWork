package com.cg.batch3.labWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of element");
		int length = sc.nextInt();

		String[] a = new String[length];
		System.out.println("enter the string value");
		sc.nextLine();
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextLine();
		}
		Arrays.sort(a);
		sc.close();
		System.out.println(Arrays.toString(a));
	}
}
