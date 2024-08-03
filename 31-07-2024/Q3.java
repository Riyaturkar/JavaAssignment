package javaDemo;

import java.util.Scanner;

public class Q3 {
public static void main (String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to total class held");
	int held = sc.nextInt();
	System.out.println("enter the number to total class attended");
	int attend = sc.nextInt();
	int allowed = Per( held, attend);
	System.out.println(allowed);
		
		
	
}

public static int Per( int held, int attend) {
	
	

	int result = (attend/held)*100 ;
	if(result <75) {
		System.out.println("Not Allowed to sit in exam");
		
		
	}
	else {
		System.out.println("Allowed to sit");
	}
	
}

}
