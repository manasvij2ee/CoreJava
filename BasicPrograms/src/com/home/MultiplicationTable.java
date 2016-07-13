package com.home;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*int a ,b,fact=1;
		System.out.println("Enter a number");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		*/
		/*Multiplication Table
		 
		 System.out.println("multiplication table of "+a+" number:");
		for(b=1;b<=10;b++){
			System.out.println(a+"*"+b+"="+b*a);
		}*/
		
		/*Factorial
		
		for(b=1;b<=a;b++)
			fact=fact*b;
		System.out.println(fact);*/
		
		String original,reverse=""; 
		System.out.println("enter");
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		System.out.println(reverse);
		
		
		
		
		
		
			
		
		
		
		
		
		
	}

}
