

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {

		TreeMap<String, Integer> t = new TreeMap<String, Integer>();

		t.put("Rahane", 20);
		t.put("Rahul", 30);
		t.put("Kohli", 150);
		t.put("Dhoni", 50);
		t.put("Lokesh", 2);

		System.out.println("tree map"+t);

		System.out.println("The players who batted");
		for(String s:t.keySet()) {

			System.out.println(s);

		}
		int run = 0;
		for (int maxRuns : t.values()) {
			LinkedList<Integer> runsList = new LinkedList<Integer>();
			runsList.add(maxRuns);
			run = Collections.max(runsList);
		}
		
		System.out.println("Highest runs is "+run);
		
		System.out.println(t.entrySet());

		System.out.println("Scores by players");
		Iterator<Map.Entry<String,Integer>> itr = t.entrySet().iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		int sum=0;
		for(Integer i:t.values()) {
			sum=sum+i;
		}
		System.out.println("total score"+sum);

		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(t.entrySet());
		Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
		Collections.sort(list, comparator.reversed());

		System.out.println("Highest runs is "+list.get(0).getValue());
		System.out.println("highest run scored by "+list.get(0).getKey());
	}
}