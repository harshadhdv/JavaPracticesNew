package Methods;
import java.util.Scanner;

//Write a method multiply() that accepts two numbers and returns their product.
public class PrintMultiply {
    public static void multiply(int a , int b){
        System.out.println("Multiplied : " + (a*b));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = s.nextInt();
        System.out.println("Enter number b : ");
        int b = s.nextInt();
        multiply(a,b);
    }
}
