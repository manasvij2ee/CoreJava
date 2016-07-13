package com.home.collections;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array={14,5,2,16,8};
		InsertionSort(array);
		
	}

	private static void InsertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp=array[i];
			for (int j = i-1; (j>=0) && (array[i]<temp);j--);
			array[i+1]=array[i];
			array[i+1]=temp;
					
					
			}
			
			
		}
	}

			