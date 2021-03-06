package com.dxctechnology.patients;

import java.util.TreeSet;

public class Patients implements Comparable<Patients> {

	private String patId;
	private String patName;
	private int patAge;

	public Patients(String patId, String patName, int patAge) {
		this.patId = patId;
		this.patName = patName;
		this.patAge = patAge;
	}

	public String getPatId() {
		return patId;
	}
	public String getPatName() {
		return patName;
	}
	public int getPatAge() {
		return patAge;
	}
	public void setPatId(String patId) {
		this.patId = patId;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public void setPatAge(int patAge) {
		this.patAge = patAge;
	}

	@Override
	public String toString() {
		return "Patients [patId=" + patId + ", patName=" + patName + ", patAge=" + patAge + "]";
	}

	@Override
	public int compareTo(Patients o) {
		return this.getPatName().compareTo(o.getPatName());
	}
	
	public static int ageFind(String name, TreeSet< Patients> patients) {
		int age = 0;
		for(Patients patient : patients) {
			boolean	result = patient.getPatName().equals(name);
			if (result == true) {	
				age = patient.patAge;
			}
		}
		return age;
	}
}
