package Methods3;

import java.util.Scanner;

//19. Create overloaded area() methods:
//- Calculate the area of a square.
//- Calculate the area of a rectangle.
//- Calculate the area of a circle.

public class AreaOverload {
    public static int area(int a){
        return a*a;
    }
    public static int area(int a,int b){
        return a*b;
    }
    public static double area(double a){
        return (22/7)*a*a;
    }
    public static void main(String[] args){
        System.out.println(area(4));
        System.out.println(area(4,15));
        System.out.println(area(4.15));
    }
}
