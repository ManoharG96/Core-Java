package com.dxctechnology.streamsemployee;

public class Employee {
	
	private String empId;
	private String empName;
	private double salary;
	private String city;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", city=" + city + "]";
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
	public String getCity() {
		return city;
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
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(String empId, String empName, double salary, String city) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.city = city;
	}
	
}
