package methods;
import java.util.Scanner;

public class Calculator {

    double num1 =0;
    double num2 =0;

    public void inputValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("First value: ");
        num1 = input.nextInt();
        System.out.println("Second value: ");
        num2 = input.nextInt();
    }

    public void som(){
        inputValue();
        double result =  num1 + num2;
        System.out.println("The result is: " + result);
    }

    public void sub(){
        inputValue();
        double result =  num1 - num2;
        System.out.println("The result is: " + result);
    }

    public void mult(){
        inputValue();
        double result =  num1 * num2;
        System.out.println("The result is: " + result);
    }

    public void div(){
        inputValue();
        double result =  num1 / num2;
        System.out.println("The result is: " + result);
    }

}
