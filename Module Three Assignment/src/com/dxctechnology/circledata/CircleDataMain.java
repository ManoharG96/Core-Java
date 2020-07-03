package com.dxctechnology.circledata;

import java.util.Scanner;

public class CircleDataMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius = scn.nextInt();
		System.out.println("enter the type of output (perimeter, area, semi circle, diameter)");
		String output = scn.next();
		CircleDate data = new CircleDate();
		float result = data.calData(radius, output);
		System.out.println("Output for "+output+" is "+String.format("%.2f", result));
		scn.close();
	}

}
