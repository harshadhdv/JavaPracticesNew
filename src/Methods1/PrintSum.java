package Methods1;
import java.util.Scanner;
//Write a method add() that accepts two integers and prints their sum.
public class PrintSum {
    public static void sum(int a , int b){
        System.out.println("sum = " + (a+b));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = s.nextInt();
        System.out.println("Enter number b : ");
        int b = s.nextInt();
        sum(a,b);
    }
}
