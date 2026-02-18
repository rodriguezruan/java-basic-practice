package basicsTests;

import java.util.Scanner;
import methods.Calculator;

public class MethodMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner value = new Scanner(System.in);

        System.out.println("1. Subtraction\n2.Som\n3.Multiplication\n4.Divison");
        int menuSelect = value.nextInt();
        switch (menuSelect){
            case 1:
                calc.sub();
                break;
            case 2:
                calc.som();
                break;
            case 3:
                calc.mult();
                break;
            case 4:
                calc.div();
                break;
            default:
                System.out.println("Favor, selecione um valor existente!!!");
        }
    }
}
