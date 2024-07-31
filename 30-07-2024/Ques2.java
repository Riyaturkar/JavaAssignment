import java.util.Scanner;
 class perimeter{
  public static int peri(int a, int b, int c){
   int per = a+b+c;
    return per;
}
}
 public class Ques2{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int a = sc.nextInt();
      int b =sc.nextInt();
       int c = sc.nextInt();
     int triperi= perimeter. peri(a,b,c);
    System.out.println(triperi+"peri is");
}
}



