package com.dxctechnology.healthcarehospital;

import java.util.ArrayList;

public class Doctor {
	private String docId;
	private String docName;
	private ArrayList<Appointment> appointmentsList = new ArrayList<Appointment>();
	
	public String getDocId() {
		return docId;
	}
	public String getDocName() {
		return docName;
	}
	public ArrayList<Appointment> getAppointmentsList() {
		return appointmentsList;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public void setAppointmentsList(ArrayList<Appointment> appointmentsList) {
		this.appointmentsList = appointmentsList;
	}
	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + ", appointmentsList=" + appointmentsList + "]";
	}

	public ArrayList<Appointment> addAppointment(Appointment appointment) {
		if (appointment != null) {
			appointmentsList.add(appointment);
		}
		return appointmentsList;
	}

	public void printAppointment() {
		for (Appointment appointment : appointmentsList) {
				System.out.println("Appointments are : "+appointment);
		}
	}
	
}
