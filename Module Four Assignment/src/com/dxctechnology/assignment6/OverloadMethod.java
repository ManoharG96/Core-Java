package com.dxctechnology.assignment6;

class Overload {
	public static double avg(int a, int b ) {
		return (a+b)/2;
	}
	public static double avg(int a, int b, int c) {
		return (a+b+c)/2;
	}
	public static double avg(double a, double b) {
		return (a+b)/2;
	}
}

public class OverloadMethod {

	public static void main(String[] args) {
		System.out.println("Average of two integers "+Overload.avg(4, 12));
		System.out.println("average of three integer"+Overload.avg(34, 43, 67));
		System.out.println("average of two doubles "+Overload.avg(34.5, 65.3));
	}

}
