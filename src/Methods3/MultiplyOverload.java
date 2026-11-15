package Methods3;

import java.util.Scanner;

//18. Create overloaded multiply() methods:
//- Multiply two integers.
//- Multiply three integers.
//- Multiply two double values.

public class MultiplyOverload {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int multiply(int a, int b , int c){
        return a*b*c;
    }
    public static double multiply(double a, double b ){
        return a*b;
    }
    public static void main (String[] args){
        System.out.println(multiply(4,15));
        System.out.println(multiply(4,15,45));
        System.out.println(multiply(4.11,15.02));
    }
}
