package com.home.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		String[] list = { "india", "america", "london" };
		List<String> arraylist = new ArrayList<String>();
		//arraylist.add("manasvi");
		for (String x : list) {
			arraylist.add(x);
		}
		System.out.println("Using Arraylist:"+arraylist);

		List<String> linkedlist = new LinkedList<String>();
		for (String x : list) {
			linkedlist.add(x);
		}
		System.out.println("Using Linkedlist:"+linkedlist);

		List<String> vector = new LinkedList<String>();
		for (String x : list) {
			vector.add(x);
		}
		System.out.println("Using Vector:"+vector);
	}


}
