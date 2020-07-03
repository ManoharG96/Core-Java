package com.dxctechnology.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FriendsListUsingArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> friendsName = new ArrayList<String>();
		
		friendsName.add("Munna");
		friendsName.add("Reddy");
		friendsName.add("Pavi");
		friendsName.add("Datta");
		friendsName.add("Syed");
		
		System.out.println(friendsName);
		System.out.println();
		
		for (Object ob : friendsName) {
			System.out.println(ob);
		}
		System.out.println();
		
		Iterator<String> it = friendsName.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
