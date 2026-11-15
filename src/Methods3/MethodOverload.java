package Methods3;

import java.util.Scanner;

//23. Create a method overloading example where the methods differ in the number and types of parameters.

public class MethodOverload {
    public static int add(int a , double b, int c , int d){
        return (int) (a+b+c+d);
    }
    public static double add(int a , int b, double c , int d){
        return a+b+c+d;
    }
    public static double add(int a , int b, int c , double d){
        return a+b+c+d;
    }
    public static double add(int a , int b, double c , double d){
        return a+b+c+d;
    }
    public static void main(String[] args){
        System.out.println(add(4,4.11,15,45));
        System.out.println(add(4,15,4.11,45));
        System.out.println(add(4,15,45,15.02));
        System.out.println(add(4,15,4.11,15.02));
    }
}
