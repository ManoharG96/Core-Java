package com.dxctechnology.cricketscore;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyers {
	double total = 0;
	public ScoreAnalyers() {
		super();
	}

	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	public void addRunsToList (int runs) {
		runsData.add(runs);
	}

	public double calRunRate () {
		for(int run : runsData) {
			total = total + run;
		}
		return total / 50;
	}

	public int lowestRun() {
		return Collections.min(runsData);
	}

	public void displayRuns(){
		for (Integer runs : runsData) {
			System.out.println(runs);
		}
	}
}