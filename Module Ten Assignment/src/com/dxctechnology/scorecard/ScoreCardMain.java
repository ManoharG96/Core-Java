package com.dxctechnology.scorecard;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreCardMain {

	public static void main(String[] args) {

		int sum = 0;
		Scanner scn = new Scanner(System.in);

		TreeMap<String, Integer> treeset = new TreeMap<String, Integer>();

		System.out.println("Enter the no of players");
		int noOfPlayer = scn.nextInt();

		for (int i = 0; i < noOfPlayer; i++) {
			System.out.println("enter the name");
			String name = scn.next();
			System.out.println("enter the runs");
			int runs = scn.nextInt();
			treeset.put(name, runs);
		}
		
		Iterator<Map.Entry<String, Integer>> iterator = treeset.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (int total : treeset.values()) {
			sum = sum + total;
		}
		
		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(treeset.entrySet());
		Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
		Collections.sort(list, comparator.reversed());

		System.out.println("Highest runs is "+list.get(0).getValue());
		System.out.println("highest run scored by "+list.get(0).getKey());
		
		System.out.println("Sum of runs "+sum);
		System.out.println("Players batted : " +treeset.keySet());
		
		System.out.println("enter the player you want to search");
		String name = scn.next();
		System.out.println("Run scored by player "+name+"    "+treeset.get(name));
		scn.close();
	}

}