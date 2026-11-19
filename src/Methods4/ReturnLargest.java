package Methods4;

import java.util.Scanner;
//26. Write a method that accepts multiple integers and returns the largest number.
public class ReturnLargest {
    public static int largest(int...numbers) {
        int counts = numbers.length;
        int large = 0;
        for (int i = 0; i < counts; i++) {
            for (int j = i; j < counts; j++) {
                if (numbers[i] > numbers[j] && numbers[i] > large) {
                    large = numbers[i];
                } else if (numbers[j] > numbers[i] && numbers[j] > large) {
                    large = numbers[j];
                }
            }
        }
        return large;
    }
    public static void main(String[] args){
        System.out.println(largest(67,23,45,67,11));
        System.out.println(largest(411,152,114,205,412));
        System.out.println(largest(24,23,25,22,26));
    }
}
