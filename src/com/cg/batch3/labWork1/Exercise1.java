package com.cg.batch3.labWork1;
import java.util.Scanner;

public class Exercise1{
//Create a method to find the sum of the cubes of the digits of an n digit number
	
	public static void main(String[] args) 
	 {
		Exercise1 l = new Exercise1();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value"); 
	  int num = sc.nextInt();
	  System.out.println("Sum of the cube of  an n digit is :" + l.sumOfCubes(num));
	  sc.close();
	 }
  public int sumOfCubes(int n) 
     {
	  int cube=1;
	  int sum =0;
	  for(int i =1;i<=n;i++)
	  {
		 cube=i*i*i; 
		 sum= sum+ cube;
	   }
	  return sum;
     }
 
}
  

