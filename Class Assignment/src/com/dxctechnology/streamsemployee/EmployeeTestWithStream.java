package com.dxctechnology.streamsemployee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeTestWithStream {

	public static void main(String[] args) {
		Employee emp1 = new Employee("E234", "Abi", 23456, "Bangalore");
		Employee emp2 = new Employee("e6784", "Reddy", 45300, "Mysore");
		Employee emp3 = new Employee("e543", "Kavi", 51378, "Noida");

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);

		List<Employee> collect = employeeList
				.stream()
				.filter(employee -> employee.getSalary()>50000)
				.collect(Collectors.toList());

		System.out.println("Printing salary greater than 50000");
		for (Employee employee : collect) {
			System.out.println(employee);
		}

		List<Employee> collect1 = employeeList
				.stream()
				.filter(employee -> employee.getEmpName().startsWith("A") || employee.getEmpName().startsWith("K"))
				.collect(Collectors.toList());

		System.out.println();
		System.out.println("Printing Name whose start with A or K");
		for (Employee employee : collect1) {
			System.out.println(employee);
		}

		List<Employee> collect2 = employeeList
				.stream()
				.filter(employee -> employee.getCity() == "Bangalore")
				.collect(Collectors.toList());

		System.out.println();
		System.out.println("Printing Name whose city is bangalore");
		for (Employee employee : collect2) {
			System.out.println(employee);
		}

	}

}
