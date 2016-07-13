package com.home.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue= new LinkedList<String>();
		queue.add("Java");
		queue.add(".Net");
		queue.add("Sql");
		queue.add("Reports");
		queue.add("ETL");
		System.out.println(queue);
		//REMOVE
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		//ELEMENT
		//System.out.println(queue.element());
		
		//PEEK
		System.out.println(queue.peek());
		//POLL
		System.out.println(queue.poll());
			}

}
