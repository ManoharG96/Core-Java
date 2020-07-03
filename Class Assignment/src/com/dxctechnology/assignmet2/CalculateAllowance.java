package com.dxctechnology.assignmet2;

public class CalculateAllowance {
	
	public int calAllow(int[] items, int size) throws AllowanceException{
		if (items.length<=0) {
			throw new AllowanceException("Invalid Array size");
		} else if (size > 3 ) {
			throw new AllowanceException("Size of array shouldn't exceed 3");
		}
		for (int i = 0; i < items.length; i++) {
			if (items[i]<0) {
				throw new AllowanceException("Invalid item count");
			} 
		}
		
		int shirtSoldAllowance = items[0]*15;
		int sareeSoldAllowance = items[1]*10;
		int otherItemAllowance = items[2]*5;
		return  shirtSoldAllowance + sareeSoldAllowance + otherItemAllowance;
	}

}
