
package javaDemo;
import java.util.Scanner;


class Q1 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int length = sc.nextInt();
		System.out.println("enter breath");
		int breath = sc.nextInt();
		 if(length==breath) {
			 System.out.println("It is a square");
		 }
		 else {
			 System.out.println("Its is a reactangel");
		 }
		
		
	}

}
