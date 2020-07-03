package com.shape;

public class Rectangle implements Polygon {
	public float length;
	public float breadth;
	
	@Override
	public void calArea() {
		float res = length * breadth;
		System.out.println("Area of rect: "+res);
	}

	@Override
	public void calPeri() {
		float res = 2*(length + breadth);
		System.out.println("Area of rect: "+res);
		
	}

}
