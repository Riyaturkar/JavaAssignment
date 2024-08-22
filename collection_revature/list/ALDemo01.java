package com.revature.coll.list;

import java.util.*;

public class ALDemo01 {
    public static void main(String[] args) {
        List <String> myList=new ArrayList<>();
   // Set myList=new HashSet();
        myList.add("Sonu");
        myList.add("Sumanta");
        myList.add("Aruna");
        myList.add("Sahana");
        myList.add("Shaik");
        myList.add("Sumanta");

      //  myList.add(123);

        System.out.println(myList);

        for(int i=0;i<myList.size();i++)
            System.out.println(myList.get(i));
        System.out.println("------------------------------------");
        Iterator myListItr=myList.iterator();
        while (myListItr.hasNext())
            System.out.println(myListItr.next());

        System.out.println("--------------- Enhanced For Loop --------------------");

        for(String element:myList)
            System.out.println(element);
    }
}
