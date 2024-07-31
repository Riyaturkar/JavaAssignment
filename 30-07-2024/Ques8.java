import java.util.Scanner;
import java.io.*;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 digit num");
        int n=sc.nextInt();
        String str = String.valueOf(n);
        if(str.length()!=5){
            System.out.println("Incorrect Value");
            return;
        }
        System.out.println("Required result = "+ (Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(3)))));
        
    }
}