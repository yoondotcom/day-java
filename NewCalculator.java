import java.util.Scanner;

class NewCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the calculate : ");
        String input = sc.next();

        int result = calculate(input);
        System.out.println("result : " + result);
    }

    public static int calculate(String input) {
        int idx;
        int result;
        idx = input.indexOf('+');

        if (idx != -1) {
            result = calculate(input.substring(0, idx)) + calculate(input.substring(idx + 1));
            return result;
        }
        
        String data = input;

        return Integer.parseInt(data);
    }

}

