package com.revature.coll.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> employeeSet=new HashSet<>();
      //  Set<String> employeeSet=new TreeSet<>();
       // Set<String> employeeSet=new LinkedHashSet<>();
        employeeSet.add("Sumanta");
        employeeSet.add("Praveena");
        employeeSet.add("Noor");
        employeeSet.add("Amit");
        employeeSet.add("Sumanta");
        employeeSet.add("Nityathi");

        for(String employee:employeeSet)
            System.out.println(employee);

    }
}
