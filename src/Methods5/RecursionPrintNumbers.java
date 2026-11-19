package Methods5;

import java.util.Scanner;

//Write a recursive method to print numbers from 1 to N.
public class RecursionPrintNumbers {
    public static int printnum(int a){
        if(a==0){
            return a;
        }
        printnum(a-1);
        System.out.println(a);
        return a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number limit : ");
        int num = s.nextInt();
        printnum(num);

    }
}
