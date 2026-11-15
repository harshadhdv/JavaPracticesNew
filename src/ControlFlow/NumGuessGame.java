package ControlFlow;
import java.util.Scanner;
import java.util.Random;
//Create a number guessing game.
//The program should generate a secret number between 1 and 100. The user must guess it.
public class NumGuessGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100)+1;


        int attempt = 0;
        while(attempt<=7){
            System.out.print("Guess the number (1-100) : ");
            int guess = s.nextInt();
            attempt++;
            if(guess==num){
                System.out.println("Correct,you got it right.");
                System.out.println("Attempts : " + attempt);
                break;
            }
            else if(guess<num){
                System.out.println("less");
            }
            else  {
                System.out.println("high");

            }
            if(attempt==8){
                System.out.println("you lost. The number is " + num);
                break;

            }
        }
    }
}
//In Java, random numbers are generated using the Random class, which is available in the java.util package.

//Let's understand how it works from the basics.
//1. What is a random number?
//A random number is a number selected unpredictably from a specified range.

//For example, suppose you want Java to generate a number between 1 and 100.

//Every time you run the program, it might generate:
//- First execution: 45
//- Second execution: 89
//- Third execution: 12
//- Fourth execution: 67
//You don't manually decide the number. Java generates it for you.
//2. How to generate random numbers in Java
//First, import the Random class.
//import java.util.Random;

//Now create an object:
//Random random = new Random();