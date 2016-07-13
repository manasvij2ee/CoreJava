package com.home;

public class ExceptionHandling {

	public static void main(String[] args) {
		 try {
			 for (int i = 5; i>=0; i--) {
				 System.out.println(10/i);				
			}			
		} catch (Exception e) {
			System.out.println("Error Message:"+e.getMessage());
			e.printStackTrace();		 
			}
	System.out.println("after loop");
	}

}
