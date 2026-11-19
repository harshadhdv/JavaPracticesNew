package Methods5;

import java.util.Scanner;

public class RecFactorial {
    public static int fact(int a){
        if (a==0){
            return 1;
        }
        return a*fact(a-1);

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        System.out.println(fact(num));
    }
}
