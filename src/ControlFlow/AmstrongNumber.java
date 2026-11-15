package ControlFlow;
import java.util.Scanner;
//Armstrong Number Checker
//Write a program to check whether a given number is an Armstrong number.

//An Armstrong number is a number equal to the sum of its digits, each raised to the power of the total number of digits.
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check Amstrong or not : ");
        int num = s.nextInt();
        int num2=num;
        int numtest=num;
        int cubetotal = 0;
        int digits = 0;
        while(num>0){
            num=num/10;
            digits++;
        }
        //looping for seperating the digits
        //we use the number 2 copy num2 here
        while (num2 > 0) {
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
