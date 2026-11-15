package VDT;
import java.util.Scanner ;
//Exact Change Calculator
//Read a purchase total and the amount paid. Print the change using the fewest ₹100, ₹50, ₹20, ₹10, ₹5, ₹2, and ₹1 notes or coins.
public class ChangeCalculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //the bill ammount
        System.out.println("Enter the bill ammount : ");
        int billamt = s.nextInt();
        // the ammount customer gave
        System.out.println("Enter the Ammount paid by the customer :");
        int amtbycus = s.nextInt() ;
        int bill = amtbycus-billamt;
        System.out.println("the change you want to return is : " + bill) ;
        int note500 = bill/500;
        int rem500 = bill%500;
        int note200 = rem500/200;
        int rem200 = rem500%200;
        int note100 = rem200/100;
        int rem100 = rem200%100;
        int note50 = rem100/50;
        int rem50 = rem100%50;
        int note20 = rem50/20;
        int rem20 = rem50%20;
        int note10 = rem20/10;
        int rem10 = rem20%10;
        int note5 = rem10/5;
        int rem5 = rem10%5;
        int note2 = rem5/2;
        int rem2 = rem5%2;
        int note1 = rem2/1;

        System.out.println("The notes you want : " );
        System.out.println(note500 + " 500 notes ");
        System.out.println(note200 + " 200 notes ");
        System.out.println(note100 + " 100 notes ");
        System.out.println(note50 + " 50 notes ");
        System.out.println(note20 + " 20 notes ");
        System.out.println(note10 + " 10 notes");
        System.out.println(note5 + " 5 notes");
        System.out.println(note2 + " 2 coins & ");
        System.out.println(note1 + " 1 coins");
    }
}
