package com.dxctechnology.healthcarehospital;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {

	private int appId;
	private Date appDate;
	private int noOfPatients;
	
	
	String dateChange () {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(appDate);
	}
	
	public int getAppId() {
		return appId;
	}
	public Date getAppDate() {
		return appDate;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public void setNoOfPatients(int noOfPatients) throws InvalidNoOfPatientsExceptions{
		if (noOfPatients >= 1 && noOfPatients <= 15)
			this.noOfPatients = noOfPatients;
		else
			throw new InvalidNoOfPatientsExceptions("Please add more patients and it should be less than 15");
	}
	@Override
	public String toString() {
		return "Appointment [appId=" + appId + ", appDate=" + dateChange() + ", noOfPatients=" + noOfPatients + "]";
	}

}
