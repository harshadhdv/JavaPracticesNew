package ControlFlow;
import java.util.Scanner;
//Armstrong Number Checker
//Write a program to check whether a given number is an Armstrong number.

//An Armstrong number is a number equal to the sum of its digits, each raised to the power of the total number of digits.
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check Amstrong or not : ");
        int num = s.nextInt();//get an number
        int num2=num;//get a copy of that number for future use
        int numtest=num;//get the copy of the number for final testing
        int cubetotal = 0;//this is the variable which adds all the cubes of the number
        int digits = 0;//this is the variable which counts the digits of the number
        while(num>0){
            num=num/10;
            digits++;
        }
        //looping for seperating the digits
        while (num2 > 0) {//we use the number 2 copy num2 here
           int temp=num2%10;
           int cube=1;//initializing the individual cubing outside the block
           //power multiplication to its digits
           for(int i = 1; i<=digits;i++){
               cube=cube*temp;
           }
           cubetotal+=cube;
           num2/=10;
        }
        if(cubetotal==numtest){
            System.out.println(numtest + " is a Amstrong number.");
        }
        else {
            System.out.println(numtest + " is not a Amstrong number.");
        }
    }
}
