package com.revature.coll.equality;

public class EmployeeManager {
public static void main(String[] args) {
	Employee e1=new Employee(1,"Jasdhir");
	Employee e2=new Employee(1,"Jasdhir");
	Employee e3=new Employee(3,"AAAA");
	
	System.out.println(e1==e2);
	System.out.println(e1.equals(e2));
	//System.out.println(e1.hashCode()+"    "+e3.hashCode());
}
}
