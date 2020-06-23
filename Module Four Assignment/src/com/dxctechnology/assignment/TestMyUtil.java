package com.dxctechnology.assignment;

class MyUtil {
	
	static double throwDice() {
		double dice = (Math.random()*6+1);
		return dice;
	}
	
	static double findAvg(double a, double b) {
		double c = a+b;
		double res = c/2;
		return res;	
	}
}

public class TestMyUtil {

	public static void main(String[] args) {
		
		MyUtil util = new MyUtil();
		
		double a = MyUtil.throwDice();
		double b = MyUtil.throwDice();
		
		System.out.println("Two dice thrown values "+a+ "\t"+b);
		System.out.println("Average of two dice thrown " +MyUtil.findAvg(a, b));
		System.out.println("Max value "+Math.max(a, b));
		System.out.println("Min value "+Math.min(a, b));
		System.out.println("ceiling of avg value "+Math.ceil(MyUtil.findAvg(a, b)));
		System.out.println("ceiling of avg value "+Math.floor(MyUtil.findAvg(a, b)));
		System.out.println("ceiling of avg value "+Math.round(MyUtil.findAvg(a, b)));

	}

}
