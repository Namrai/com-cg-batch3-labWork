package com.cg.batch3.labWork6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	public static int getSecondSmallest(int[] a) {

		List<Integer> l = new ArrayList<Integer>();

		for(int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}

		Collections.sort(l);
		return l.get(1);
	}

	public static void main(String[] args) {
		while(true) {
			System.out.println("Enter Arr here:");
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("Second Smallest Integer is:");
			System.out.println("_ _ _ _");
			System.out.println(getSecondSmallest(a));
			sc.close();
		}
	}

}
