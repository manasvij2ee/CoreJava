package com.home.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
			List<String> list =new ArrayList<String>();
			list.add("google");
			list.add("amazon");
			list.add("ebay");
			//list.add("google");
			
			//HASHSET - Random
			Set<String> hashset= new HashSet<String>(list);
			System.out.println("Using Hashset:"+" "+ hashset);
			
			//TREESET - Alphabetical order
			Set<String> treeset= new TreeSet<String>(list);
			System.out.println("Using Treeset:"+" "+treeset);
			
			//LINKEDLIST - Given order
			Set<String> linkedhashset= new LinkedHashSet<String>(list);
			System.out.println("Using Linkedhashset:"+" "+linkedhashset);
	}

}
