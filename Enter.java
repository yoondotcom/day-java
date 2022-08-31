import java.util.Scanner;

class Enter{
  public static void main(String[] args){
    
    Scanner yourName = new Scanner(System.in);
    
    while(true) {
        System.out.println("Enter your name");

        String name = yourName.next();
        
        if(name.equals("exit")) {
            break;
        }else{
            System.out.println("Enter your name");
            yourName.next();
        }
    }

  }
}