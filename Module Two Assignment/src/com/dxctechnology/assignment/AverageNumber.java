package com.dxctechnology.assignment;

import java.util.Scanner;

public class AverageNumber {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the marks of five student");
		
		int avg=0, res = 0;
		int [] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			avg = avg + arr[i];
			res = avg/5;
		}
		
		System.out.println("Average marks of five students "+ "\t"+res);
		
	}
}
