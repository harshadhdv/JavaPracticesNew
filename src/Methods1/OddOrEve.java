package Methods1;
import java.util.Scanner;
//Write a method isEven() that accepts an integer and returns true if it is even.
public class OddOrEve {
    public static boolean isEven(int a ){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check odd or even : ");
        int num = s.nextInt();
        System.out.println(isEven(num));

    }
}
