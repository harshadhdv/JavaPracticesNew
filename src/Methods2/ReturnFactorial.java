package Methods2;

import java.util.Scanner;

//Write a method that accepts a number and returns its factorial.
public class ReturnFactorial {
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        return a * factorial(a-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : " );
        int num = s.nextInt();
        System.out.println("factorial is : " + factorial(num));
    }
}
