package ControlFlow;
import java.util.Scanner ;
//Largest of Three Numbers
//Write a program that accepts three integers and identifies the largest number.
public class LargestNumber {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = s.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = s.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = s.nextInt();

        if(num1==num2){
            System.out.println("Number 1 and 2 are same.");
        }
        else if (num2==num3) {
            System.out.println("Number 2 and 3 are same.");
        }
        else if (num1==num3) {
            System.out.println("Number 1 and 3 are same.");
        }
        else{
            if(num1 > num2 && num1 > num3){
                System.out.println("Number 1 is largest.");
            }
            else if (num2 > num1 && num2 > num3) {
                System.out.println("Number 2 is largest.");
            }
            else {
                System.out.println("Number 3 is largest");
            }
        }
    }
}
