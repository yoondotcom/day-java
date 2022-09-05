import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator{
    public static void main(String[] args){

      List<Integer> list = new ArrayList<>();

      Scanner sc = new Scanner(System.in);
    
      System.out.println("Enter first number");

      list.add(Integer.parseInt(sc.nextLine()));

      System.out.println("Enter second number");

      list.add(Integer.parseInt(sc.nextLine()));

      System.out.println("Choose one");
      System.out.println("add, min, mul, div");

      String sign = sc.next();

      switch (sign) {
        case "add":
          System.out.println("Result is " + add(list.get(0), list.get(1)));
          break;
        case "min":
          System.out.println("Result is " + min(list.get(0), list.get(1)));
          break;
        case "mul":
          System.out.println("Result is " + mul(list.get(0), list.get(1)));
          break;
        case "div":
          System.out.println("Result is " + div(list.get(0), list.get(1)));
          break;
      }
      sc.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}