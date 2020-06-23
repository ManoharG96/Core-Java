package com.dxctechnology.patientsduplicate;

import java.util.Comparator;

public class PatientAgeComparator implements Comparator<Patients> {

	@Override
	public int compare(Patients o1, Patients o2) {
		
		return o1.getPatAge()- o2.getPatAge();
	}

}
