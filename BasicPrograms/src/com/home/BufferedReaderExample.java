package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter your name");
			
			String name= reader.readLine();
			System.out.println("Hello"+" "+ name);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}