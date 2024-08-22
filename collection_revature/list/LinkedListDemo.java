package com.revature.coll.list;
import java.util.*;

public class LinkedListDemo {
	public static void main(String args[])
    {
        // Creating object of the  class linked list
       List<String> ll     = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
 
        System.out.println(ll);
 
        ll.remove("B");
        System.out.println("After Removing 'B' " +ll);
        ll.remove(3);
        System.out.println("After Removing at Index 3 "+ll);
        ll.removeFirst();
        System.out.println("After Removing First "+ll);
        ll.removeLast();
        System.out.println("After Removing Last "+ll);
        System.out.println(ll);
        
        ll.add("B");
        System.out.println(ll);
        ll.set(1, "BB");
        System.out.println(ll);
        Iterator<String> llItr=ll.iterator();
        while(llItr.hasNext())
        	System.out.println(llItr.next());
    }
}
