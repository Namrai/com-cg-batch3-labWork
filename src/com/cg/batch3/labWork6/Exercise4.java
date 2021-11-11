package com.cg.batch3.labWork6;

import java.util.HashMap;
import java.util.Map.Entry;

public class Exercise4 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> st = new HashMap<>();
		st.put(101, 90);
		st.put(105, 100);
		st.put(104, 70);
		st.put(102, 50);
		st.put(103, 80);
		System.out.println(getStudents(st));
	}

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> st) {
		HashMap<Integer, String> sc = new HashMap<>();
		for (Entry<Integer,Integer> m : st.entrySet()) {
			if ((int) m.getValue() >= 90) {
				sc.put((int) m.getKey(), "Gold");
			} else if ((int) m.getValue() >= 80 && (int) m.getValue() < 90) {
				sc.put((int) m.getKey(), "Silver");
			} else if ((int) m.getValue() >= 70 && (int) m.getValue() < 80) {
				sc.put((int) m.getKey(), "BRONZE");
			}
		}
		return sc;
	}
}
