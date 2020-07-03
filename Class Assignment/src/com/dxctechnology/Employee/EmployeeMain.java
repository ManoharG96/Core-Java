package com.dxctechnology.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee emp1 = new Employee("e123", "Munna", 12345);
		Employee emp2 = new Employee("e453", "Reddy", 34532);
		Employee emp3 = new Employee("e987", "Ducky", 54763);
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		
		ListIterator<Employee> empListIterator = employeeList.listIterator();
		while(empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}
		Collections.sort(employeeList, new EmployeeNameComparator()); // 
		System.out.println("After Sorting on the basis of employee Name :----");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		Collections.sort(employeeList, new EmployeeSalaryComparator()); // 
		System.out.println("After Sorting on the basis of employee Salary :----");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
	}

}
