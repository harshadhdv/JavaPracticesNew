package Methods3;

import java.util.Scanner;

//20. Create overloaded display() methods:
//- Accept an integer.
//- Accept a String.
//- Accept a double.

public class DisplayOverload {
    public static int display(int a){
        return a;
    }
    public static String display(String a){
        return a;
    }
    public static double display(double a){
        return a;
    }
    public static void main(String[] args){
        System.out.println(display(415));
        System.out.println(display("harshaa"));
        System.out.println(display(4.15));
    }
}
