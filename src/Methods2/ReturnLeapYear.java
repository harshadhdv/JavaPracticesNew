package Methods2;

import java.util.Scanner;

//Write a method that accepts a year and returns whether it is a leap year.
public class ReturnLeapYear {
    public static String leapyear(int year ){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return " is a Leap Year";
        }
        else {
            return " is Not a Leap Year";
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not : ");
        int year = s.nextInt();
        System.out.println(year + leapyear(year));
    }
}
