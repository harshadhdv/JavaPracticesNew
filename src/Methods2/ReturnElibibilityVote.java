package Methods2;

import java.util.Scanner;

//Write a method that accepts a person's age and returns whether they are eligible to vote.
public class ReturnElibibilityVote {
    public static String eligible(int age){
        if(age>=18){
            return "eligible";
        }
        else {
            return "not eligible";
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        System.out.println(age + " is " + eligible(age));
    }
}
