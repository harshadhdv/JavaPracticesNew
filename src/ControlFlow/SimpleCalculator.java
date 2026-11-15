package ControlFlow;
import java.util.Scanner ;
//Simple Calculator
//Create a calculator that accepts two numbers and an operator (+, -, *, /, %).
//
//Perform the corresponding mathematical operation.
//Requirements:
//- Handle all five operators.
//- Display an error for invalid operators.
//- Prevent division by zero.

public class SimpleCalculator {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = s.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = s.nextInt();
        System.out.println("Enter the operation : 1) + 2) - 3) * 4) / 5) % ");
        String opr = s.next();
        System.out.println(opr);
        switch (opr) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Error Calculation");
        }
    }
}
