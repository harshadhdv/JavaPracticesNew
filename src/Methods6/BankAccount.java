package Methods6;

import java.util.Scanner;

//46. Create a BankAccount class with:
//- Instance variable: balance.
//- Static variable: bank name.
//- Methods: deposit(), withdraw() and displayBalance().
public class BankAccount {
    //instance variable
    double bal;
    //static variable
    static String bank = "IDBI Bank" ;
    //method to deposit ammount
    double deposit(Scanner s){
        System.out.println("Enter the ammount to deposit : ");
        double a = s.nextDouble();
        if(a>0){
            bal+=a;
        }
        else {
            System.out.println("Invalid ammount .");
        }
        return bal;
    }
    //method to withdraw the ammount
    double withdraw(Scanner s){
        System.out.println("Enter the ammount to withdraw : ");
        double a = s.nextDouble();
        if(a<=0){
            System.out.println("Invalid ammount .");
        } else if (a>bal) {
            System.out.println("Insufficient Balance .");
        } else {
            bal-=a;
        }
        return bal;
    }
    //method to display the current balance
    double displayBal(){
        return bal;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //creating an object for BankAccount class
        BankAccount acc1 = new BankAccount();
        System.out.println("Welcome to " + bank);

        System.out.println("Enter the bank balance");
        acc1.bal = s.nextDouble();

        int opt;
        while (true){
            System.out.println(" ");
            System.out.println("Enter an option you want to do :");
            System.out.println("Press 1 for deposit .");
            System.out.println("Press 2 for withdraw .");
            System.out.println("Press 3 to check balance .");
            System.out.println("Press 0 to exit");

            opt=s.nextInt();

            switch (opt){
                case 1 :
                    System.out.println("current Balance is " + acc1.deposit(s));
                    break;
                case 2 :
                    System.out.println("current Balance is " + acc1.withdraw(s));
                    break;
                case 3 :
                    System.out.println("current Balance is " + acc1.displayBal());
                    break;
                case 0 :
                    System.out.println("Thank you come again!...");
                    return;

                default:
                    System.out.println("Invalid Option .");
            }
        }
    }
}
