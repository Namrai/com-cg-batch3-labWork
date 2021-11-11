package com.cg.batch3.labWork6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Exercise6 {
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> pl=new HashMap<>();
		pl.put(101,1999);
		pl.put(103,1989);
		pl.put(102,2019);
		pl.put(106,1989);
		pl.put(104,2009);
		pl.put(105,2004);
		
		System.out.println(voterslist(pl));

	}
	public static List<Integer> voterslist(HashMap<Integer,Integer> pl){
		List<Integer> list=new ArrayList<>();
		for(Entry<Integer, Integer> m:pl.entrySet()) {
			int age=2024-(int)m.getValue();
			if(age>18) {
				list.add((int)m.getKey());
			}
		}
		return list;
	}

}
