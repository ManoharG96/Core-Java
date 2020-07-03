package com.dxctechnology.employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreEmployee {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("enter the no of employee to be added");

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		int noOfEmployeeAdded = scn.nextInt();
		
		for (int i = 0; i < noOfEmployeeAdded; i++) {
			System.out.println("enter the employee id");
			int id = scn.nextInt();
			System.out.println("enter the employee name");
			String name = scn.next();
			System.out.println("enter the Dept no");
			int no = scn.nextInt();
			employeeList.add(new Employee(id, name, no));
		}

		try{   
			FileOutputStream file = new FileOutputStream(args[0]); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
			for (Employee employee : employeeList) {
				out.writeObject(employee);
			}
			System.out.println("Employee Object has been serialized in "+args[0]); 
			out.close(); 
			file.close(); 
		} 

		catch(IOException ex) { 
			System.out.println(ex.getMessage()); 
		} 

		System.out.println("Employee Object has been deserialized and displayed below"); 
		try{    
			FileInputStream file = new FileInputStream(args[0]); 
			ObjectInputStream in = new ObjectInputStream(file); 
			Employee line = null;
			while ((line=(Employee) in.readObject()) != null) {
				if (line!=null)
					System.out.println(line);
			}
			in.close(); 
			file.close(); 
		} 

		catch(Exception ex) { 
			System.out.println(ex.getMessage()); 
		} 
		scn.close();
	}
}
