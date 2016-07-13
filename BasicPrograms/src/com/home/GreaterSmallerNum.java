package com.home;

import java.util.Scanner;

public class GreaterSmallerNum {

	public static void main(String[] args) {
		int x=100;
		int y=209;
		int z=5;
		if (x > y && x > z) {
			System.out.println(" x is greater");
		} else if (y > x && y > z) {
			System.out.println(" y is greater");
		} else if (z > x && z > y) {
			System.out.println(" z is greater");

		}
		if (x < y && x < z) {
			System.out.println(" x is smaller");
		} else if (y < x && y < z) {
			System.out.println(" y is smaller");
		} else if (z < x && z < y) {
			System.out.println(" z is smaller");

		}
	}
	

}
