package com.dxctechnology.streams;

import java.util.ArrayList;

public class NamesWithStreams {

	public static void main(String[] args) {

		ArrayList<String> namesList = new ArrayList<String>();

		namesList.add("Rakesh");
		namesList.add("Munna");
		namesList.add("Reddy");
		namesList.add("Raj");
		namesList.add("pavi");
		namesList.add("dattu");

		namesList.forEach(names->{
			System.out.println(names);
		});

		System.out.println();
		System.out.println("Starting with letter 'r' or 'R' which contains 4 letters atleast");

		namesList.stream()
		.filter(names->names.startsWith("R") || names.startsWith("r"))
		.forEach(names->{
			if (names.length()>4)
				System.out.println(names);
		});
	}
}
