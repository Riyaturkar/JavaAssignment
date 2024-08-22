package com.revature.coll.set;
import java.util.*;
public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> h = new HashSet<String>(); 
	//TreeSet<String> h = new TreeSet<String>();
	
	//LinkedHashSet<String> h = new LinkedHashSet<String>();
	
    // Adding elements into HashSet using add() 
    h.add("India"); 
    h.add("Australia"); 
    h.add("South Africa"); 
    h.add("India"); // adding duplicate elements 
  //  h.add(null);

    // Displaying the HashSet 
    System.out.println(h); 
    System.out.println("List contains India or not:"
                       + h.contains("India")); 

    // Removing items from HashSet using remove() 
    h.remove("Australia"); 
    System.out.println("List after removing Australia:"
                       + h); 

    // Iterating over hash set items 
    System.out.println("Iterating over list:"); 
    Iterator<String> i = h.iterator(); 
    while (i.hasNext()) 
        System.out.println(i.next());
    
    for (String s : h) 
        System.out.print(s + ", "); 
    System.out.println(); 
}
}
