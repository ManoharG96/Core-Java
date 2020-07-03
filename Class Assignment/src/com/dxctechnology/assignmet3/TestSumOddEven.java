package com.dxctechnology.assignmet3;

import java.util.Scanner;

public class TestSumOddEven {

	public static void main(String[] args) {
		
		ArraySumOddEven sum = new ArraySumOddEven();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size = scn.nextInt();
		
		System.out.println("enter the array with size "+size);
		int [] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scn.nextInt();
		}
		
		int [] res = sum.sumOddEven(array);
		for (int i = 0; i < res.length; i++) {
			System.out.println("Sum of even and odd numbers are " +res[i]);
		}
		scn.close();
	}
}
