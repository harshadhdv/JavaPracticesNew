package Methods2;

import java.util.Scanner;

//Write a method that accepts a student's marks in five subjects and returns the total marks.
public class ReturnTotalMarks {
    public static double totalMarks(double a , double b, double c, double d , double e ){
        return (a+b+c+d+e);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter mark 1 :");
        double a = s.nextDouble();
        System.out.print("Enter mark 2 :");
        double b = s.nextDouble();
        System.out.print("Enter mark 3 :");
        double c = s.nextDouble();
        System.out.print("Enter mark 4 :");
        double d = s.nextDouble();
        System.out.print("Enter mark 5 :");
        double e = s.nextDouble();
        System.out.println("total marks is : " + totalMarks(a,b,c,d,e));
    }
}
