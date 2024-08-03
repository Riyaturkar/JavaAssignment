package javaDemo;
import java.util.*;
public class Q8 {
	public static void main(String [] args) {
		for(int i =100;i<=500;i++) {
			if(isArmstrong(i)) {
				 System.out.println(i);
			}
		}
		
		
	}
   public static  boolean isArmstrong (int num) {
	   int sum = 0;
       int temp = num;
       while (temp != 0) {
           int digit = temp % 10;
           sum += Math.pow(digit, 3);
           temp /= 10;
       }
       return sum == num;
   }
}
