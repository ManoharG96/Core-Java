package com.dxctechnology.filestatenames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StoringStatesUsingFile {

	public static void main(String[] args) throws Exception {

		File file = new File("states.txt");
		FileReader reader  = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();

		String line;
		int count = 0;
		System.out.println("states that are present in state.txt");
		while ((line=bufferedReader.readLine())!=null) {
			hashSet.add(line);
			System.out.println(line);
			count ++ ;
		}
		System.out.println("Total states present in txt file "+count);

		System.out.println("Removing the delhi state");
		hashSet.remove("delhi");

		System.out.println("remaining states are "+hashSet);

		System.out.println("Adding to the treeset");
		TreeSet< String > treeset = new TreeSet<String>();
		treeset.addAll(hashSet);

		Iterator< String> iterator = treeset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("displaying the state with start with letter k");
		for (String states : treeset) {
			char kWord = states.charAt(0);
			if (kWord == 'k' || kWord == 'K') {
				System.out.println(states);
			}
		}
		bufferedReader.close();

	}

}
