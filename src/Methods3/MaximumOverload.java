package Methods3;

import java.util.Scanner;

//Create overloaded maximum() methods:
//- Find the maximum of two integers.
//- Find the maximum of three integers.
//- Find the maximum of two double values.

public class MaximumOverload {
    public static int maximum(int a , int b ){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static int maximum(int a , int b , int c){
        if(a>b&&a>c){
            return a;
        } else if (b>a&&b>c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static double maximum(double a , double b ){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args){
        System.out.println(maximum(4,15));
        System.out.println(maximum(4,15,45));
        System.out.println(maximum(4.11,15.02));
    }
}
