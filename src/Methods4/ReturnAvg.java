package Methods4;
import java.util.Scanner;

//25. Write a method that accepts multiple numbers and returns their average.
public class ReturnAvg {
    public static double average(double...numbers){
        double sum = 0;
        for(double num : numbers){
            sum+=num;
        }
        double avg = sum /numbers.length ;
        return avg;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count : ");
        int count = s.nextInt();
        double[] numbers = new double[count];
        System.out.println("Enter the numbers : ");
        for(int i = 0;i<count;i++){
            numbers[i]= s.nextDouble();
        }
        System.out.print("The average is : ");
        System.out.println(average(numbers));
        System.out.println(average(12,23,34,45,56,67,78,89));
        System.out.println(average(5,15));

    }
}
