package com.cg.batch3.labWork6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(getSquares(a));
		sc.close();
	}

	public static Map<Integer, Integer> getSquares(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			int n = i * i;
			map.put(i, n);
		}
		return map;
	}

}
