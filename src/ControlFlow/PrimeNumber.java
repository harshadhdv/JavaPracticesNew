package ControlFlow;
import java.util.Scanner;
//Prime Number Checker
//Write a program that accepts an integer and determines whether it is a prime number.
//
//A prime number is divisible only by 1 and itself.
//prime number have only 2 factors,1 and the number itself...
//so if we try to take modulus for each number until the target number ...the modulus count will be 2(1 & that number)
//if the count is exactly 2 ...then the number is prime
//if the count is more or less than 2 ... then the number is not prime
public class PrimeNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        int count =0;
        for(int i = 1 ; i<=num;i++){
            if(num%i==0){
                count++;
            }


        }
        if(count==2){
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
