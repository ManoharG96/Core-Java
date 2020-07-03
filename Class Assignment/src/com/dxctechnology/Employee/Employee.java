package com.dxctechnology.Employee;

public class Employee {
	
	private String empId;
	private String empName;
	private double salary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary +"]";
	}
	public Employee(String empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
