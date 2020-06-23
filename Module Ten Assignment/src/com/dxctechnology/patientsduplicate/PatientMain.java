package com.dxctechnology.patientsduplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

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

		/*TreeSet< Patients> patientSet = new TreeSet<Patients>();
		System.out.println("Added to the Treeset");
		patientSet.addAll(patients);
		System.out.println(patientSet);*/
		
		Collections.sort(patients, new PatientAgeComparator());
		System.out.println("Sorted based on age ");
		for (Patients patients2 : patients) {
			System.out.println(patients2);
		}

		LinkedHashSet<Patients> linkedHashSetPatients = new LinkedHashSet<Patients>();
		linkedHashSetPatients.addAll(patients);
		System.out.println("Size of the linked hash set is : "+linkedHashSetPatients.size());
		for (Patients patients1 : linkedHashSetPatients) {
			System.out.println(patients1);
		}
		scn.close();
	}
}
