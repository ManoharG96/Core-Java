package com.dxctechnology.patients;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PatientMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		ArrayList<Patients> patients = new ArrayList<Patients>();

		System.out.println("enter the three patients details");
		for (int i = 0; i < 3; i++) {
			System.out.println("enter the patient id");
			String patId = scn.next();
			System.out.println("enter the patient Name");
			String patName = scn.next();
			System.out.println("enter the patient age");
			int patAge = scn.nextInt();
			patients.add(new Patients(patId, patName, patAge));
		}

		Collections.sort(patients);
		System.out.println("Sorted based on name ");
		for (Patients patients2 : patients) {
			System.out.println(patients2);
		}

		TreeSet< Patients> patientSet = new TreeSet<Patients>();
		System.out.println("Added to the Treeset");
		patientSet.addAll(patients);
		System.out.println(patientSet);
		
		Collections.sort(patients, new PatientAgeComparator());
		System.out.println("Sorted based on age ");
		for (Patients patients2 : patients) {
			System.out.println(patients2);
		}
		
		System.out.println("Enter the name you want to search");
		String name = scn.next();
		System.out.println("Age of patient "+name+" is "+Patients.ageFind(name, patientSet));
		scn.close();
	}
}
