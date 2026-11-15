package VDT;
import java.sql.SQLOutput;
import java.util.Scanner;
//Average of Test Scores
//Store scores for five tests. Calculate and print the average.
public class AvgScore {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Score 1:");
        int sc1 = s.nextInt();
        System.out.print("Enter Score 2:");
        int sc2 = s.nextInt();
        System.out.print("Enter Score 3:");
        int sc3 = s.nextInt();
        System.out.print("Enter Score 4:");
        int sc4 = s.nextInt();
        System.out.print("Enter Score 5:");
        int sc5 = s.nextInt();
        double avg = (sc1+sc2+sc3+sc4+sc5)/5;
        System.out.println("The Average Score is " + avg);

    }
}
