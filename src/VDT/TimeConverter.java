package VDT;
import java.util.Scanner;

//Time Converter
//Store a duration in seconds and convert it into hours, minutes, and leftover seconds.

//1 minute = 60 seconds, 1 hour = 60 minutes , 3600 seconds , 1 day = 86400 seconds
//simple divide the seconds to know how many minutes , if minutes is larger than 60 ,
//divide them by hours ,rest of the seconds will be found using modulus(remainder) of seconds%60
public class TimeConverter {
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Seconds :");
        int x = s.nextInt() ; //this will be the variable for given seconds
        System.out.println("Given Seconds :" + x);
        int day = x/86400;
        int hours = (x%86400)/3600 ;
        int minutes = (x%3600)/60;
        int seconds = x%60;
        System.out.println(day + " day(s) " + hours + " hours " + minutes + " minutes & " + seconds + " seconds.");




    }
}
