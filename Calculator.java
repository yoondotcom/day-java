import java.util.Scanner;

class Calculator{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number");

    String a = sc.next();

    System.out.println("Enter second number");
        
    String b = sc.next();

    int Result = Integer.parseInt(a) + Integer.parseInt(b);
     
    System.out.println("Result is " + Result);
   
  }
}