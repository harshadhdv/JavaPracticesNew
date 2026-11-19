package Methods5;

import java.util.Scanner;

//Write a recursive method to calculate the power of a number (for example, 2⁵).
public class RecPower {
    public static int power(int a, int b){
        if(b==0){
            return 1;
        }
        return a * power(a,b-1);

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        System.out.println("Enter the power number : ");
        int pow = s.nextInt();
        System.out.println(power(num,pow));
    }
}
