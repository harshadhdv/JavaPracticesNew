package Methods5;

import java.util.Scanner;

//Write a recursive method to generate the Fibonacci sequence up to N terms.
public class RecFibonacci {
    public static int fibo(int a, int b,int count){
        if(count==0){
            return b;
        }
        int c = a+b;
        System.out.print(c + " ");
        return fibo(b,c,count-1);
    }
    public static void main(String[] args){
        int a = 0 ;
        int b = 1 ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit for fibonacci series : ");
        int c = s.nextInt();
        fibo(a,b,c);
    }
}
