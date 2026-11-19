package Methods5;
//Write a recursive method to count the number of digits in an integer.
public class RecCountDigits {
    public static int count(int a){
        if(a<10){
            return 1;

        }
        return 1 + count(a/10);
        //the digit is atleast must be 1 if they enter even single digit .
    }
    public static void main(String[] args){
        System.out.println(count(143));
    }
}
