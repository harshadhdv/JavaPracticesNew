package Methods;
import java.util.Scanner;

//Write a method displayName() that accepts a name as a parameter and prints it.
public class PrintName {
    public static void print(String name){
        System.out.println(name);
    }
    public static void main (String[] args){
        print("Harshadh Devaraj");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name you want to print Second : ");
        String name2 = s.nextLine();
        print(name2);
    }
}
