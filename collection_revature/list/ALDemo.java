package com.revature.coll.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ALDemo {
    public static void main(String[] args) {
        List<String> myList=new ArrayList();

        myList.add("Jasdhir");
        myList.add("Madhan");
        myList.add("Bazeer");
        myList.add("Jannani");
        myList.add("Deepak");
       // myList.add(1000);
        for(String name:myList)
            System.out.println(name);

        myList.remove("Jasdhir");
        myList.remove(2);

        for(String name:myList)
            System.out.println(name);
       /* Iterator myItr=myList.iterator();
        while(myItr.hasNext())
            System.out.println(myItr.next());

        for(int i=0;i<myList.size();i++)
            System.out.println(myList.get(i));*/


    }
}
