package javaDemo;

import java.util.Scanner;

public class Q4 {
	public static void main (String[] args) {
		
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 digits");
		for(int i =1;i<=10;i++) {
			System.out.println("enter interger "+ i+":");
			int num = sc.nextInt();
			sum+=num;
			
		}
		double avg = (double) sum/10;
		
		System.out.println(avg+"is the average");
			
		
	}

}
