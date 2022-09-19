import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator{
    public static void main(String[] args){

        Calculate();

    }

    private static void Calculate() {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            String value = sc.nextLine();

            if(value.equals("add")) {
                System.out.println("Result is " + add(list));
                break;
            }else if(value.equals("min")) {
                System.out.println("Result is " + min(list));
                break;
            }else if(value.equals("mul")) {
                System.out.println("Result is " + mul(list));
                break;
            }else if(value.equals("div")) {
                System.out.println("Result is " + div(list));
                break;
            }else{
                list.add(Integer.parseInt(value));
                list.add(Integer.parseInt(value));
            }
        }
        Calculate();

    }

    public static int add(List a) {
        int result = 0;
        for(int i = 0; i > a.size(); i++){
            int enter = (int) a.get(i);
            result += enter;
        }
        return result;
    }

    public static int min(List a) {
        int result = 0;
        for(int i = 0; i > a.size(); i++){
            result -= i;
        }
        return result;
    }

    public static int mul(List a) {
        int result = 0;
        for(int i = 0; i > a.size(); i++){
            result *= i;
        }
        return result;
    }

    public static int div(List a) {
        int result = 0;
        for(int i = 0; i > a.size(); i++){
            result /= i;
        }
        return result;
    }

}