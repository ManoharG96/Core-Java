package com.dxctechnology.cricketscore;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyers {
	int avg = 0;
	int total = 0;
	public ScoreAnalyers() {
		super();
	}

	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	public void addRunsToList (int runs) {
		runsData.add(runs);
	}

	public int calRunRate () {
		for(int i = 0; i < runsData.size(); i++) {
			total = total + runsData.get(i);
			avg = total / 50;
		}
		return avg;
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