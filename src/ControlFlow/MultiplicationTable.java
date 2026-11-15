package ControlFlow;
import java.util.Scanner;

//Multiplication Table
//Write a program that accepts a number and prints its multiplication table from 1 to 10.

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number for tables : ");
        int a = s.nextInt();
        System.out.println("Enter the Number of Multiplications : ");
        int b = s.nextInt();
        for(int i = 1 ; i<=b;i++){
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}
