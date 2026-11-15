package VDT;
import java.util.Scanner ;

//Shopping Receipt
//Store the prices of three items and a tax rate. Print the subtotal, tax amount, and final total.

public class RecieptCalculator {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in) ;
       System.out.print("Price of Item 1 : ");
       int itm1 = s.nextInt();
       System.out.print("Price of Item 2 : ");
       int itm2 = s.nextInt();
       System.out.print("Price of Item 3 : ");
       int itm3 = s.nextInt();
       System.out.print("Enter tax % : ");
       int tax = s.nextInt();
       int total = itm1+itm2+itm3;
       System.out.println(total);
       double taxamt = total*tax/100 ;
       double taxtotal = total+taxamt;

       System.out.println("Total bill with tax : " + taxtotal);




    }
}
