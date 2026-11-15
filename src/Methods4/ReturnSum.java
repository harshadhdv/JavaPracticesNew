package Methods4;

import java.util.Scanner;

//24. Write a method that accepts any number of integers and returns their sum.
public class ReturnSum {
    public static int add(int...numbers){
        int sum = 0;
        for(int num : numbers){
            sum=sum+num;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(add(4,11));
        System.out.println(add(4,15,45));
        System.out.println(add(4,15,11,2,45));
        System.out.println(add(4114,1502,2004,2005));
    }

}
