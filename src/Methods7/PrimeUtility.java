package Methods7;

//48. Prime Number Utility
//Create separate methods to:
//- Check whether a number is prime.
//- Print all prime numbers between 1 and N.
//- Return the count of prime numbers in a range.

import java.util.Scanner;

public class PrimeUtility {
    //method 1 to check prime
    static boolean isprime(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (a%i==0){
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        else {
            return false;
        }
    }
    //method to print all prime numbers from 1 to N .
    //1 is not a prime number
    static void printprime(int a){

        for (int i = 1 ; i <=a ; i++){
            int count = 0 ;
            for (int j = 1 ; j<=i ; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i + " , ");
            }
        }
    }
    //method to return the no of prime number in a range
    static int primerange(int a , int b){
        int noprime = 0 ;
        for(int i = a ; i<=b ; i++){
            int count = 0 ;
            for (int j = 1 ; j<b ; j++){
                if (i%j==0){
                    count ++;
                }
            }
            if (count==2){
                noprime++;
            }
        }
        return noprime;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        if ((isprime(num) == true)) {
            System.out.println("prime .");
        }
        else {
            System.out.println("not prime .");
        }
        printprime(50);
        System.out.println(" ");
        System.out.println("no of prime is :" + primerange( 1,50));
    }
}
