package com.dxctechnology.assignmet3;

public class ArraySumOddEven {
	
	public int[] sumOddEven(int[] array) {
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumEven = sumEven + array[i];
				
			} else {
				sumOdd = sumOdd + array[i];
			}
		}
		
		int [] res = {sumEven , sumOdd};
		return res;
	}
	
}
