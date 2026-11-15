package VDT;
import java.util.Scanner ;
//Split a Restaurant Bill
//Store the bill amount, tip percentage, and number of people. Calculate the tip, total bill, and each person’s share.

public class SplitBillCalculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the bill ammount :");
        double bill = s.nextDouble();
        System.out.println("Enter the tip ammount :");
        double tip = s.nextDouble() ;
        Double total = bill+tip;
        System.out.println("Enter number of people to split bill :");
        int people = s.nextInt() ;
        double splitamt = total/people ;
        System.out.println("The Split Ammount is : " + splitamt);
    }
}
