package Methods2;
import java.util.Scanner;
//Write a method to calculate the area of a rectangle using length and breadth.
public class AreaOfRectangle {
    public static int arearectangle(int a , int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = s.nextInt();
        System.out.println("Enter the breath : ");
        int breath = s.nextInt();
        System.out.println("area of rectsngle is : " + arearectangle(length,breath));
    }
}
