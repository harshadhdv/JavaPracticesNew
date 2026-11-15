package Methods;
import java.util.Scanner;
//Write a method subtract() that accepts two integers and returns their difference.
public class PrintSubtract {
    public static void sub(int a , int b){
        System.out.println("Difference is : " +  (a-b));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = s.nextInt();
        System.out.println("Enter number  : ");
        int b = s.nextInt();
        sub(a,b);
    }

}
