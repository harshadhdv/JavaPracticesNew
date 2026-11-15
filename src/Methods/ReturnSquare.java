package Methods;
import java.util.Scanner;

//Write a method getSquare() that accepts a number and returns its square.
public class ReturnSquare {
    public static int square(int a){
        return a*a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to square : ");
        int a = s.nextInt();
        System.out.println(square(a));

    }
}
