package com.home.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		//HASHMAP - 1 null key , Many null values , No duplicates.
		Map<String, Integer> hashmap =new HashMap<String, Integer>();
		hashmap.put("manasvi", 4);
		hashmap.put("vivek", 8);
		hashmap.put(null, 41);
		hashmap.put("key", null);
		hashmap.put("viman", 41);
		hashmap.put("viman", 41);
		hashmap.put(null, null);
		System.out.println("Using Hashmap:"+" "+hashmap);
		
	//LINKEDHASHMAP - same as hashma but sorts in given order.
	Map<String, Integer> linkedhashmap =new LinkedHashMap<String, Integer>();
		linkedhashmap.put("manasvi", 4);
		linkedhashmap.put("vivek", 8);
		linkedhashmap.put(null, 41);
		linkedhashmap.put(null, null);
		linkedhashmap.put("viman", 41);
		linkedhashmap.put("viman", 41);
		linkedhashmap.put(null, null);
        System.out.println("Using linkedHashmap:"+" "+linkedhashmap);
        
     //HASHTABLE - No nul keys & values. Gives Exception.  
	Map<String, Integer> hashtable =new Hashtable<String, Integer>();
	    hashtable.put("manasvi", 4);
	    hashtable.put("vivek", 8);
	    hashtable.put("viman", 41);
	    hashtable.put("viman", 41);
	   //hashtable.put("manvi", null);		
		System.out.println("Using Hashtable:"+" "+hashtable);
		
	//TREEMAP - Alphabetical order	
	Map<String, Integer> treemap =new TreeMap<String, Integer>();
	    treemap.put("manasvi", 4);
	    treemap.put("vivek", 8);
	    treemap.put("viman", 41);
	    treemap.put("viman", 41);
	    treemap.put("manvi", 14);
	   // treemap.put(null, null);		
		System.out.println("Using TreeMap"+" "+treemap);
	}

}
