package Methods5;
//Write a recursive method to check whether a number is a palindrome.
public class RecPalindrome {
    public static boolean palindrome(int a){
        if(a<10){//declare a single digit is always a palindrome
            return true;
        }
        int first = a;//to get the first digit first get the copy of the number and later divided
        int last = a%10 ;// the last digit
        int divisor = 1 ;
        //finding the first digit
        while(first>=10){
            first =first/10;
            divisor*=10;
        }
        //compare first and last digit
        if(first!=last){
            return false ;
        }
        //remove the first and last digits
        //a%divisor will give the remainder after the first number is gone (143%10=43)
        //a/10 will remove the last digit of the number
        a=(a%divisor)/10;
        return palindrome(a);
    }
    public static void main(String[] args){
        int num = 12321;
        if(palindrome(num)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
