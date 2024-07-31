import java.util.Scanner;
class robert{
 public static int total(int a, int b, int c){
    int total = a+b+c;
    return total;

 }
 public static double peri(int a, int b , int c){
    double total = a+b+c;
    double per = (total/300)*100;
    return per;

  }
}
public class Ques4{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int a = sc.nextInt();
       int b =sc.nextInt();
       int c = sc.nextInt();
       int totalm= robert.total(a,b,c);
       double perm= robert.peri(a,b,c);
       System.out.println(totalm+"total");
       System.out.println(perm+"percentage"+ perm +"%");
  }
}
