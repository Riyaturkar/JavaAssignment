package com.revature.coll.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<String,Double> balance=new HashMap<String,Double>();
	//TreeMap<String,Double> balance=new TreeMap<String,Double>();
	balance.put("John", 1000.5);
	balance.put("Jane", 2560.50);
	balance.put("Tom", 5678.50);
	balance.put("Todd", 4567.50);
	balance.put("Jane", 1000.00);
	System.out.println(balance.get("Jane"));
	
	Set<String> keys=balance.keySet();
	for(String key:keys)
		System.out.println(key +" : "+balance.get(key));
}
}
