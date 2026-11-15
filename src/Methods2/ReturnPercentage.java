package Methods2;
import java.util.Scanner;

//Write a method that accepts total marks and maximum marks and returns the percentage.
public class ReturnPercentage {
    public static double percentage(double a , double b){
        return (a/b)*100;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the obtained marks : ");
        double mark = s.nextDouble();
        System.out.println("Enter the total marks : ");
        double total = s.nextDouble();
        System.out.println("the percentage is : " + percentage(mark,total));
    }
}
