package com.dxctechnology.healthcarehospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestClinic {

	public static void main(String[] args) throws InvalidNoOfPatientsExceptions, ParseException {

		Scanner scn = new Scanner(System.in);
		Doctor [] doctorArray = new Doctor[3];

		ArrayList<Appointment> appList = new ArrayList<Appointment>();

		System.out.println("enter the three doctor details");
		for (int i=0; i<3; i++) {
			
			Doctor doctorObject = new Doctor();
			System.out.println("enter the doctor id "+(i+1));
			String docId = scn.next();
			doctorObject.setDocId(docId);

			System.out.println("enter the doctor name"+(i+1));
			String docName = scn.next();
			doctorObject.setDocName(docName);

			System.out.println("enter the 4 appointments for Doctor no "+(i+1));

			for (int j = 0; j < 4; j++) {
				Appointment appointmentObject = new Appointment();
				System.out.println("enter the appointment no "+(j+1)+" id for doctor "+docName);
				int appId = scn.nextInt();
				appointmentObject.setAppId(appId);

				System.out.println("enter the appointment no "+(j+1)+" date for doctor "+docName+"(dd-MM-yy)");
				SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yy");
				Date date = dateFormate.parse(scn.next());
				appointmentObject.setAppDate(date);

				System.out.println("Enter the noOfPatients for appointment no "+(j+1)+" (Number should be between 1 and 15) for doctor "+docName);
				int n = scn.nextInt();
				try {
					appointmentObject.setNoOfPatients(n);
				} catch (InvalidNoOfPatientsExceptions e) {
					System.err.println(e.getMessage());
				}
				appList = doctorObject.addAppointment(appointmentObject);
			}
			doctorObject.setAppointmentsList(appList);
			doctorArray [i] = doctorObject;
		}

		System.out.println("enter the Doctor Id to be search");
		String docId = scn.next();
		for (Doctor doctor : doctorArray) {
			if (doctor.getDocId().equalsIgnoreCase(docId)) {
				for (Appointment list: doctor.getAppointmentsList())
					System.out.println("Doctor Id "+docId+" appointmentlist : "+list);
				break;
			}else {
				System.out.println("id is not available");
				break;
			}
		}
		scn.close();
	}
}
