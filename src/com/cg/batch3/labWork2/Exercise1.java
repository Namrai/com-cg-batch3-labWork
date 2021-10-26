package com.cg.batch3.labWork2;
import java.util.Arrays;
import java.util.*;

public class Exercise1 {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of integer");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter the integer value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
		sc.close();
	}
}// another method:
//		int a =secondSmallest(arr,n);
//		System.out.println(a);
//		sc.close();
//	}
//	
//   public static int secondSmallest(int arr[],int n) {
//	   for (int i=0 ;i<n-1;i++) {
//		   for(int j=i+1;j<n;j++) {
//			   if(arr[j]<arr[i]) {
//				   int temp =arr[i];
//				   arr[i]=arr[j];
//				   arr[j]=temp;
//			   }
//		   }
//	   }return arr[1];
//   }
//	
//}
