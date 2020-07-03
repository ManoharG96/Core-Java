package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class PolygonDriver {

	public static void main(String[] args) {
		
		Square square = new Square();
		square.side = 20;
		square.calArea();
		square.calPeri();
		
		Rectangle rectangle = new Rectangle();
		rectangle.length = 10;
		rectangle.breadth = 20;
		rectangle.calArea();
		rectangle.calPeri();
		
	}

}
