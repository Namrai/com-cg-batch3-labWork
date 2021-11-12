package com.cg.batch3.labWork10;

import java.util.*;
import java.io.*;

class Excercise1 {
	public static void main(String args[]) throws IOException {
		int j = 1;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter File name: ");
		String str = sc.next();
		FileInputStream file = new FileInputStream(str);
		System.out.println("\nContents of the file are");
		int n = file.available();
		System.out.print(j + ": ");
		for (int i = 0; i < n; i++) {
			ch = (char) file.read();
			System.out.print(ch);
			if (ch == '\n') {
				System.out.print(++j + ": ");

			}

		}
		sc.close();
		file.close();
	}
}