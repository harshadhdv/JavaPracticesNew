package ControlFlow;
import java.util.Scanner ;

//1. Positive, Negative, or Zero
//Write a Java program that accepts an integer from the user and checks whether it is:
//- Positive
//- Negative
//- Zero

public class NumberCheck {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = s.nextInt();
        if(num<0){
            System.out.println("Negative Number");
        }
        else if (num==0) {
            System.out.println("Number is 0");

        }
        else {
            System.out.println("Positive Number");
        }
    }
}
