import java.util.ArrayList;
import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int number = 0;
        String sign = "";

        while (true) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                arrayList.add(number);
            } else {
                sign = sc.next();
                System.out.println("arrayList : " + arrayList);
                System.out.println("sign : " + sign);
                calculate(arrayList, sign);
                arrayList.clear();
            }
        }
    }

    private static void calculate(ArrayList<Integer> arrayList, String sign) {

        if(sign.equals("add")) {
            System.out.println("Add Result is " + add(arrayList));
        }else if(sign.equals("min")) {
            System.out.println("Min Result is " + min(arrayList));
        }else if(sign.equals("mul")) {
            System.out.println("Mul Result is " + mul(arrayList));
        }else if(sign.equals("div")) {
            System.out.println("Div Result is " + div(arrayList));
        }
    }

    public static int add(ArrayList<Integer> arrayList) {
        int result = 0;
        for(int i = 0; i < arrayList.size(); i++){
            result += arrayList.get(i);
        }
        return result;
    }

    public static int min(ArrayList<Integer> arrayList) {
        int result = arrayList.get(0);
        arrayList.remove(0);
        for(int i = 0; i < arrayList.size(); i++){
            int enter = arrayList.get(i);
            result -= enter;
        }
        return result;
    }

    public static int mul(ArrayList<Integer> arrayList) {
        int result = arrayList.get(0);
        arrayList.remove(0);
        for(int i = 0; i < arrayList.size(); i++){
            int enter = arrayList.get(i);
            result *= enter;
        }
        return result;
    }

    public static int div(ArrayList<Integer> arrayList) {
        int result = arrayList.get(0);
        arrayList.remove(0);
        for(int i = 0; i < arrayList.size(); i++){
            int enter = arrayList.get(i);
            result /= enter;
        }
        return result;
    }

}