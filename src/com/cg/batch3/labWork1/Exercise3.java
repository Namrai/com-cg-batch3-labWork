package com.cg.batch3.labWork1;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		System.out.println("ENTER THE nTH TERM FOR ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2;i<num;i++)
		{
			int c = a+b;
			System.out.print(a+" "+b);
			System.out.print(" "+c);
			a=b;
			b=c;
		}
     sc.close();
  }
}
