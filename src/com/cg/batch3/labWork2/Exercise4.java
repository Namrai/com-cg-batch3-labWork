package com.cg.batch3.labWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		System.out.println("Enter the number of Element");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] array = new int[len];
		System.out.println("Enter the elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		System.out.println("Given array are :" + Arrays.toString(array));
		int length = duplicate(array, array.length);
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
	}
}

	public static int duplicate(int[] array,int n) {
		int j = 0;
		for (int i = 0; i < n-1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			}
		}

		array[j++] = array[n - 1];
		return j;
	}
}
