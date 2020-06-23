package com.dxctechnology.cricketscore;

import java.util.Scanner;

public class ScoreAnaliserMain {

	public static void main(String[] args) {
		int count = 0;
		ScoreAnalyers analyers = new ScoreAnalyers();

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the runs scored by playes");
		
		int runs = 0; 
		
		for (int i = 0; i < 11; i++) {
			runs = scn.nextInt();
			if (runs != 0) {
				analyers.addRunsToList(runs);
				count ++;
			}
		}
		
		System.out.println("Run rate "+analyers.calRunRate());
		System.out.println("Lowest run "+analyers.lowestRun());
		analyers.displayRuns();
		System.out.println("total batsman played "+count);
		scn.close();
	}

}
