package Methods5;

import java.util.Scanner;

//Write a recursive method to reverse a number

public class RecReverseNum {
    public static int reverse(int a, int rev){
        if(a==0){
            return rev;
        }
        return reverse(a/10,rev*10 + a%10);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int num = s.nextInt();
        System.out.println(reverse(num,0));
    }

}



//num=num%10;
//num2=num;
//