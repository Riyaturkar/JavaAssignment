package javaDemo;
import java.util.*;

public class Q2 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks =  sc.nextInt();
		String grade = grading(marks);
		System.out.println("Grade is ="+grade);
		
		}
		
		
	

 public  static String  grading( int marks){
	 
	
	
	if (marks<25) {
		return "F";
	}
	else if (marks<45) {
		return "g";
	}
	else if (marks<55) {
		return "h";
	}
	else if(marks<60) {
		return "i";
	}
	else if (marks<80) {
		return "j";
	}
	else {
		return "k";
	}
	
}
}
