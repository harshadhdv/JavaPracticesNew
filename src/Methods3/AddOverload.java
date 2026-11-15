package Methods3;

import java.util.Scanner;

//17. Create overloaded add() methods:
//- Add two integers.
//- Add three integers.
//- Add two double values.
public class AddOverload {
    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a,int b , int c){
        return a+b+c;
    }
    public static double add(double a ,double b){
        return a+b;

    }
    public static void main(String[] args){
        System.out.println(add(4,15));
        System.out.println(add(4,15,45));
        System.out.println(add(4.11,15.02));
    }
}
