package com.dxctechnology.assignmet4;

public class StringReverse {

	public String reverseString (String name) {
		
		StringBuffer buffer = new StringBuffer(name);
		String reverseNames = buffer.reverse().toString();
		
		return reverseNames;
	}
}
