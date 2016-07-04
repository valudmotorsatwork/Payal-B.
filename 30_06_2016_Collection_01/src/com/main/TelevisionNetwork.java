package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class TelevisionNetwork
{
	public void televisionNetwork(){
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	HashMap<String, TreeSet<String>> networkMap = new HashMap<String, TreeSet<String>>();
	while (true) {
		System.out.print(" Enter the name of the Network ");
		String nwk = sc.nextLine();
		System.out.print(" Enter  the Television show ");
		String sw = sc.nextLine();
		TreeSet<String> showset = networkMap.get(nwk);
		if (showset == null) {
			showset = new TreeSet<String>();
			showset.add(sw);
			networkMap.put(nwk, showset);
		} else {
			showset.add(sw);
		}
		System.out.println(networkMap);
		System.out.print(" Do you want to Continue? Y/N : ");
		//System.out.println(" Please enter only Y or N ");
		String choice = sc.nextLine();
		if (choice.equals("N")|| choice.equals("n")) {
			break;
		}
	}
	System.out.println("Inserted");
	System.out.println(networkMap);
	System.out.println("Sorted Order is");
	ArrayList<String> keyList = new ArrayList<String>(networkMap.keySet());
	Collections.sort(keyList);
	for (String str : keyList) {
		System.out.println(str + "" + networkMap.get(str));
	}

}
}

