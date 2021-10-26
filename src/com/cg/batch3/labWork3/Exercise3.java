package com.cg.batch3.labWork3;
import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args) {
		System.out.println("enter the string value");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
		    char a=str.charAt(i);
		    if(a=='A'|| a=='E' || a=='I'|| a=='O' || a=='U'||a=='a'|| a=='e' || a=='i'|| a=='o' || a=='u'){
		        System.out.print(a);
		    }else{
		        int b=a;
		        char c=(char)(b+1);
		        System.out.print(c);
		        sc.close();
		    }
		}
	}
}