package com.home.arrays;

public class MaxMinElementInArray {

	public static void main(String[] args) {

		int[] a = { 11, 10, 15, 5, 3, 8 };
		int max = a[0];
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}else if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(max+"is maximum element");
		System.out.println(min+"is minimum element");
		}

}
