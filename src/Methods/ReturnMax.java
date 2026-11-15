package Methods;
import java.util.Scanner;
//Write a method getMaximum() that accepts two integers and returns the larger number.
public class ReturnMax {
    public static int getMaximum(int a , int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = s.nextInt();
        System.out.println("Enter the second number : ");
        int b = s.nextInt();
        System.out.println("Largest number is : " + getMaximum(a,b));
    }
}
