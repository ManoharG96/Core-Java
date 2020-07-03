package com.dxctechnology.assignmet4;

public class StringArrayMain {
	public static void main(String[] args) {
		String[] name = {"munna", "reddy", "pavi"};
		
		StringReverse reverse = new StringReverse();
		for (int i = name.length-1; i >=0; i--) {

			System.out.println(reverse.reverseString(name[i]));
		}	
	}
}
