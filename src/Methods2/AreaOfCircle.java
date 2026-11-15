package Methods2;
import java.util.Scanner;

//Write a method to calculate the area of a circle using radius.
public class AreaOfCircle {
    public static double areacircle(int a){
        return (22.0 / 7) * a * a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the circle radius : ");
        int r = s.nextInt();
        System.out.println("area of circle is " + areacircle(r));
    }
}
