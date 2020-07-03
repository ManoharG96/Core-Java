package com.dxctechnology.assignment;

public class WrapperTest {

	public static void main(String[] args) {
		
		double number;
		double res = 0;
		
		for (int i = 1; i <args.length; i++) {
			number = Double.parseDouble(args[i]);
			res = res + number;
		}
		System.out.println(res);

	}

}
