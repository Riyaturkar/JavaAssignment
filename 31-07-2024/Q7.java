package javaDemo;
import java.util.*;



public class Q7 {
   public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int first=  sc.nextInt();
	   System.out.println("First number");
	   int second = sc.nextInt();
	   System.out.println("Second number");
	   int gcd = gcdresult(first,second);
	   System.out.println("The GCD of " + first + " and " + second);
	   
	   
	   
   }
   public static int gcdresult(int num1, int num2){
		if(num2 == 0) {
			return num1;
		}
		return gcdresult(num2,num1%num2);
	}
		
}
