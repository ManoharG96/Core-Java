package com.dxctechnology.assignmet;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		CalculateSalary salary = new CalculateSalary();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the salary per month");
		int amount = scn.nextInt();
		System.out.println("enter the shift done in one month");
		int shift = scn.nextInt();
		try {
			System.out.println(salary.calculateSal(amount, shift));
		} catch (SalaryValidationException e) {
			System.out.println(e.getMessage());
		}
		scn.close();
	}
}
