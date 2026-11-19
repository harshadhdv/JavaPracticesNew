package Methods5;

import java.util.Scanner;

//Write a recursive method to calculate the sum of numbers from 1 to N.

public class RecSum {
    public static int sum(int a){
        if(a==0){
            return a;
        }

        return a+sum(a-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = s.nextInt();
        System.out.println(sum(num));
    }
}
