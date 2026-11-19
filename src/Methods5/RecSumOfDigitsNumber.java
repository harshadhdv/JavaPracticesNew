package Methods5;

//Write a recursive method to find the sum of digits of a number.

public class RecSumOfDigitsNumber {
    public static int sumdigit(int a){
        if(a<10){
            return a;
        }
        return a%10 + sumdigit(a/10);
    }
    public static void main(String[] args){
        System.out.println(sumdigit(2355));
    }
}
