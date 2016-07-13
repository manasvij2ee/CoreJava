package com.home;

public class Multithreading extends Thread {

	public static void main(String[] args) {
		Multithreading thread= new Multithreading();
		thread.start();
		}
	public void run(){
		System.out.println("My thread is running.");
	}
}
