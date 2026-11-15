package ControlFlow;
import java.util.Scanner;

//Pattern Printing Using Nested Loops
//Write a program that accepts the number of rows and prints the following pattern.

//Example (N = 5):
//*
//**
//***
//****
//*****
public class PatternPrint {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number of rows for pattern : ");
        int num = s.nextInt();

        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

        for(int i = 1;i<=num;i++){
            //print the spaces
            for(int j = 1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
