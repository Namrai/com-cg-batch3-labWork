package com.cg.batch3.labWork9;

import java.util.Scanner;

public class Exercise3 {
   public static void main(String[] args) {
	Demo3 obj = ()->{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter username: ");
	 String userName = sc.next();
	 System.out.println("Enter password");
	 String passWord = sc.next();
	 if(userName.equals("Sree") && passWord.equals("User1")) 
		 return true;
	return false;
	};
	if(obj.checkUserName())
		System.out.println("valid user name and password");
	else
		System.out.println("Invalid credentials");
   }
}
  