package com.dxctechnology.employee;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int empId;
	private String empName;
	private int deptNo;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptNo=" + deptNo + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public Employee(int empId, String empName, int deptNo) {
		this.empId = empId;
		this.empName = empName;
		this.deptNo = deptNo;
	}
	
	
}
