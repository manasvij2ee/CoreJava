package com.home.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack= new Stack<>();
		stack.push("Manasvi");
		stack.push("Vivek");
		stack.push("Viman");
		stack.push("Manvi");
		System.out.println(stack);		
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
	}
}
