package com.dxctechnology.lambaexpression;

public class LambaExpressionMain {

	public static void main(String[] args) {
		
		SquareNumberFunctionalInterface square = (a) -> {
			int res= a*a;
			return res ;
		};
		System.out.println(square.square(13));
		
		FunctionalClass name = () -> {
			System.out.println("My name is Munna");
		};
			
		System.out.println(name);
		
		ReverseStringFunctionalInterface reverse = (string) -> {
			StringBuffer buffer = new StringBuffer(string); 
			return buffer.reverse().toString();
		};
		
		System.out.println(reverse.reverse("Munna"));
	}

}
