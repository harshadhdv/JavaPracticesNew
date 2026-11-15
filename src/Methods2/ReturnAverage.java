package Methods2;
import java.util.Scanner;

//Write a method that accepts three integers and returns their average.
public class ReturnAverage {
    public static double average(double a , double b , double c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        double a = s.nextDouble();
        System.out.println("Enter number 2 : ");
        double b = s.nextDouble();
        System.out.println("Enter number 3 : ");
        double c = s.nextDouble();
        System.out.println("average of these numbers is : " + average(a,b,c));
    }
}
