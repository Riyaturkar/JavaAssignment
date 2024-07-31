import java.util.Scanner;
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number ");
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            rev = rev*10 + n%10;
            n=n/10;
        }
        System.out.println("Required sum = "+rev);  
        }
}