package com.revature.coll.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> employees=new HashMap();

        employees.put(101,"Viraj");
        employees.put(102,"Tarinish");
        employees.put(103,"Sana");
        employees.put(104,"Neha");
        employees.put(105,"Sowmiya");

        System.out.println(employees);

        Set<Integer> setOfEmpIds=employees.keySet();

        System.out.println(setOfEmpIds);
        for(Integer empId:setOfEmpIds)
            System.out.println(empId +" :: "+employees.get(empId));

    }
}
