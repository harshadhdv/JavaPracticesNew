package ControlFlow;
import java.util.Scanner;

//Sum of Even and Odd Numbers
//Write a program that accepts a positive integer N and calculates:
//- Sum of all even numbers from 1 to N.
//- Sum of all odd numbers from 1 to N.
public class SumOddEve {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Limit Number : ");
        int num = s.nextInt();

        int oddsum = 0;
        int evesum = 0;
        for(int i =1;i<=num;i++){
            if(i%2==1){
                oddsum +=i;
            }
            if(i%2==0){
                evesum+=i;
            }
        }
        System.out.println("Sum of all odd numbers : " + oddsum);
        System.out.println("Sum of all even numbers : " + evesum);
    }
}
