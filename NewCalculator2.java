import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class NewCalculator2 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the calculate : ");
            String s = scan.nextLine();

            if(s == "exit")
                break;

            Object result = engine.eval(s);
            System.out.println("result : " + result);
        }

        scan.close();
    }

}
