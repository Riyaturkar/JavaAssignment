package com.revature.coll.list;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		

		// Declaring the ArrayList 
	
		ArrayList<Integer> arrli = new ArrayList<Integer>();

		// Appending new elements 
		for (int i = 1; i <= 5; i++)
			arrli.add(i);
		// Printing elements
		System.out.println(arrli); // values or obj
		arrli.add(20);
		System.out.println(arrli);
		// Remove element at index 3 
        arrli.remove(3); 
        System.out.println(arrli.get(1));
        // Displaying the ArrayList 
        // after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i = 0; i < arrli.size(); i++) 
            System.out.print(arrli.get(i) + " ");  
        System.out.println();
        
        // Inserting at index 4
        arrli.add(4, 100); 
        for (int i = 0; i < arrli.size(); i++) 
            System.out.println("Index No :"+i+" Value : "+arrli.get(i) + " "); 
     // setting at index 3
    	arrli.set(2, 3333);
    	arrli.set(3, 3333);
    	for (int i = 0; i < arrli.size(); i++) 
            System.out.println("Index No :"+i+" Value : "+arrli.get(i) + " "); 
    	
    	ArrayList<Integer> removeLst=new ArrayList<Integer>();
    	removeLst.add(3333);
    	arrli.removeAll(removeLst);
    	//for (int i = 0; i < arrli.size(); i++)
    	for(int i:arrli)
           System.out.println(i);
	}
	

}
