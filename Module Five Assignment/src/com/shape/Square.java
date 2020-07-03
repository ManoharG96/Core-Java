package com.shape;

public class Square implements Polygon {

	public float side; 
	

	@Override
	public void calArea() {
		float res = side * side;
		System.out.println("Area of a square: "+res);
	}

	@Override
	public void calPeri() {
		float res = 4*side;
		System.out.println("perimeter of square: "+res);
	}

}
