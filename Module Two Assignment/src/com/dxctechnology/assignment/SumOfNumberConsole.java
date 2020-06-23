package com.dxctechnology.assignment;
import java.util.Scanner;

public class SumOfNumberConsole {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = a+b;
		System.out.println("Sum of above two number is");
		System.out.println(c);
	}

}
