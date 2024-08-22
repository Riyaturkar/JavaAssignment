package com.revature.coll.sort;
import java.util.*;
public class CollectionSort {
public static void main(String[] args) {
	 // Create a list of strings 
    ArrayList<String> al = new ArrayList<String>(); 
    al.add("Java"); 
    al.add("Friends"); 
    al.add("Dear"); 
    al.add("Is"); 
    al.add("Superb"); 

    /* Collections.sort method is sorting the elements of ArrayList in ascending order. */
    Collections.sort(al); 

    // Let us print the sorted list 
    System.out.println("List after the use of" + " Collection.sort() :\n" + al);
    
    Collections.sort(al, Collections.reverseOrder()); 
    
    // Let us print the sorted list 
    System.out.println("List after the use of" +  " Collection.sort() :\n" + al);
}
}
