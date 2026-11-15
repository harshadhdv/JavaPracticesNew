package ControlFlow;
import java.util.Scanner;
//Number-Based Menu-Driven Program
//Create a menu-driven Java application that repeatedly displays:
//===== MENU =====
//
//1. Check Even or Odd
//2. Check Prime Number
//3. Find Factorial
//4. Reverse a Number
//5. Check Palindrome
//6. Exit
//
//Enter your choice:
public class NumberMenu {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("===Menu===");
        System.out.println("1.Check even or odd");
        System.out.println("2.check prime number");
        System.out.println("3.find factorial");
        System.out.println("4.reverse a number");
        System.out.println("5.check palindrome");
        System.out.println("6.exit");
        System.out.print("Enter the option number : ");
        int opt = s.nextInt();
        switch (opt){
            case 1 ://case 1
                System.out.print("Enter a number to check even or odd : ");
                int num = s.nextInt();
                if(num%2==0){
                    System.out.println(num +" is even.");
                }
                else {
                    System.out.println(num + " is odd.");
                }
                break;
            case 2 ://case 2
                System.out.print("enter a number to check prime : ");
                int isprime= s.nextInt();
                int count=0;
                for(int i = 1 ; i<=isprime;i++){
                    if(isprime%i==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println(isprime + " is a prime number.");
                }
                else {
                    System.out.println(isprime + " is not a prime number.");
                }
                break;
            case 3 ://case 3
                System.out.print("enter the number you want to find factorial : " );
                int numfact = s.nextInt();
                int fact = 1;
                for(int i = 1;i<=numfact;i++){
                    fact=fact*i;
                }
                System.out.println("factorial of "+ numfact + " is " + fact);
                break;
            case 4 ://case 4
                System.out.print("enter a number you want to reverse : ");
                int numrev = s.nextInt();
                int rev=0;
                int temp = 1;
                while(numrev>0){
                    temp = numrev%10;
                    rev=rev*10 + temp;
                    numrev/=10;
                }
                System.out.println("reversed number : " + rev);
                break;
            case 5 ://case 4
                System.out.print("enter the number you want to check palindrome : ");
                int pal = s.nextInt();
                int paltest = pal;
                int revpal = 0;
                int temp2 = 1;
                while(pal>0){
                    temp2=pal%10;
                    revpal=revpal*10 + temp2;
                    pal/=10;
                }
                if (paltest==revpal){
                    System.out.println(paltest + " s a palindrome.");
                }
                else {
                    System.out.println(paltest + " is not a palindrome.");
                }
                break;
            case 6 :
                break;
        }
    }
}
