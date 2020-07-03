package com.dxctechnology.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeCaluculator {
	
	public void calAge (String dateOfBirth) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		try {
			
			Date birthDate = simpleDateFormat.parse(dateOfBirth);
			long birthTime = birthDate.getTime();
			long presentTime = date.getTime();
			long differnce = presentTime - birthTime ;
			Date age = new Date(differnce);
			System.out.println(age);
			
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		//return 0;
	}

}
