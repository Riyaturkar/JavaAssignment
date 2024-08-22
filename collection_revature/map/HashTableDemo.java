package com.revature.coll.map;
import java.util.*;
public class HashTableDemo {
public static void main(String[] args) {
	Hashtable<String,Double> balance=new Hashtable<String,Double>();
	balance.put("John", 1000.50);
	balance.put("Jane", 2560.50);
	balance.put("Tom", 5678.50);
	balance.put("Todd", 4567.50);
	System.out.println(balance.get("John"));
	
	Enumeration names;
	String str;
	
	names=balance.keys();
	while(names.hasMoreElements()) {
		str=(String) names.nextElement();
		System.out.println(str+" : "+balance.get(str));
	}
	
}
}
