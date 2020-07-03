package com.dxctechnology.Employee;

import java.util.Comparator;


public class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Double emp1Salary = o1.getSalary();
		Double emp2Salary = o2.getSalary();
		return emp1Salary.compareTo(emp2Salary);
	}

}
