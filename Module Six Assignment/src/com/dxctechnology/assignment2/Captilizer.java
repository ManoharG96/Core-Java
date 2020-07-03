package com.dxctechnology.assignment2;

public class Captilizer {

	public String captilize(String string) {
		
		char ch = ' ';
		
		String data = string.toLowerCase();
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < data.length(); i++) {
			if (ch == ' '  && data.charAt(i) != ' ') 
                buffer.append(Character.toUpperCase(data.charAt(i))); 
            else
                buffer.append(data.charAt(i)); 
           ch = data.charAt(i); 
		}

		return buffer.toString();

	}

}
