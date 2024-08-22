package com.revature.coll.sort;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> empList=new ArrayList<>();

        Employee e1=new Employee(101,"Karishma",200000);
        Employee e2=new Employee(102,"Praveena",2000001);

        empList.add(e1);
        empList.add(e2);

        empList.add(new Employee(103,"Balaji",250000));
        empList.add(new Employee(104,"Venu",260000));

        System.out.println(empList);

        for(Employee emp:empList)
            System.out.println(emp);


       // Collections.sort(empList);

        System.out.println(empList);
    }
}
