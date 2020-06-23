package com.dxctechnology.studentmarks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		int avg = 0;
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		System.out.println("enter the no of students");
		int no = scn.nextInt();
		
		System.out.println("enter the marks");
		for (int i = 0; i < no; i++) {
			marks.add(scn.nextInt());
			avg = avg +marks.get(i);
		}
		int i = Collections.max(marks);
		System.out.println("Highest Marks is "+i);

		System.out.println("Average marks of above student marks "+avg);
		System.out.println("Marks of third Student is "+marks.get(2));
		System.out.println("Sorted order of students marks ");
		Collections.sort(marks);
		System.out.println(marks);
		scn.close();
	}
}
