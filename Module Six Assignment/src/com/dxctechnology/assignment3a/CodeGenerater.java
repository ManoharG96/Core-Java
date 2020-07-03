package com.dxctechnology.assignment3a;

public class CodeGenerater {

	public StringBuffer generateCode (String string) {

		StringBuffer buffer = new StringBuffer(string);
		StringBuffer reverse = buffer.reverse();
		StringBuffer remove = reverse.deleteCharAt(0);
		StringBuffer replace = remove.replace(0, 2, "*");
		StringBuffer replaceLast = replace.replace(replace.length()-1, replace.length(), "#");
		String convertString = new String(replaceLast);
		String upperCase =convertString.toUpperCase();
		return new StringBuffer(upperCase);


	}

}
