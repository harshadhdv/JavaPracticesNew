package Methods5;

import java.util.Scanner;

//Write a recursive method to print numbers from N to 1.
public class RecPrintNumbersRev {
    public static int printnum(int a){
        if(a==0){
            return a;
        }
        System.out.println(a);
        printnum(a-1);
        return a ;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number limit : ");
        int num = s.nextInt();
        printnum(num);
    }
}
