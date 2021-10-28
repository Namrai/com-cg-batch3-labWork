package com.cg.batch3.labWork3;

import java.io.FileInputStream;
import java.io.*;

//to display number of line char and text.

public class Exercise4 {
	public static void main(String[] args) 
	{
		try {
		int noChar=0;
		int noline=0;
		int noWord=0;
		int c=0;
	
		FileInputStream func =new FileInputStream("D:\\sample.txt");
		while((func.available()!=0))
		{ 
			c=func.read();
			if(c!=10)
				noChar++;
			if(c == 32)
				noWord++;
			if(c==13)
			{
				noline++;
				noWord++;
			}
		}
		System.out.println(noChar);
		System.out.println(noWord);
		System.out.println(noline);
		func.close();
		}catch(FileNotFoundException e) {
			System.out.println("Cannot find the specified  file ");
		}catch(IOException i) {
			System.out.println("cannot read file");
		}
	}
}