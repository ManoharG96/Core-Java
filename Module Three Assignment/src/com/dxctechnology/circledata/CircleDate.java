package com.dxctechnology.circledata;

public class CircleDate {
	public float calData (float radius, String output) {
		float result = 0;
		if (output.equalsIgnoreCase("diameter")) {
			result = 2 * radius;
		} else if (output.equalsIgnoreCase("area")) {
			result = (float) (Math.PI * radius * radius);
		} else if (output.equalsIgnoreCase("perimeter")) {
			result = (float) (2 * Math.PI * radius);
		} else if (output.equalsIgnoreCase("semi circle")) {
			result = (float) (Math.PI * radius);
		}
		return result;

	}
}
