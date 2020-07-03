package com.dxctechnology.assignment;

public class ExceptionText {

	public static void main(String[] args) {

		try {
			String[] number = args;

			if (args.length <= 0) {
				System.out.println("No argruments are passed");
			} 

			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			
			int res = x / y;

			System.out.println("result: "+res);

		}catch (NumberFormatException e) {
			System.out.println("Enter only intergers");

		}catch (ArithmeticException e) {
			System.out.println("Cant divide with zero");
		} 

	}

}
