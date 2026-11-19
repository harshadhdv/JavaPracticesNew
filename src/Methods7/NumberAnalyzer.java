package Methods7;

//49. Number Analyzer
//Create separate methods to:
//- Check whether a number is Armstrong.
//- Check whether a number is palindrome.
//- Check whether a number is perfect.
//- Check whether a number is strong.


//any number with a 0 is not always or automatically an amstrong number.
//the digits must satisfy the condition.
public class NumberAnalyzer {
    static int fact(int a){
        if(a==0){
            return 1 ;
        }
        return a*fact(a-1);
    }
    //method1 to find amstrong number or not
    static boolean amstrong(int a){
        int num = a ;//number copy 1
        int num2 = a ;//number copy 2
        int numtest = a ;//number copy for final testing
        int digits = 0 ;//initialing the digits variable
        while(num>0){//finding the digits
            num/=10;
            digits++;
        }
        int powertotal = 0 ;//variable to addd all the digits which multiplied to its power .
        while(num2>0){//there is also 1 in count so limit starts from 0 .
            int digit = num2%10 ;//getting the last digit by modulus the num .
            int power = 1 ;//initialing the power variable for the individual power multiplications of the number .
            for (int i = 1 ; i<=digits ; i++){//finding the power multiplications for the individual variables .
                power = power * digit ;//it loops until the power multiplication of individual digit until its number of digits
            }
            powertotal+=power;//finally we are adding the power multiplications of each digits .

            num2/=10;//its important to update the number by removing its last digit for next iteration
        }
        if (powertotal==numtest){//final testing
            return true ;
        }
        else {
            return false;
        }
    }
    //method2 to find whether a number is palindrome or not
    static boolean palindrome(int a) {
        if (a < 10) {//declare single digit is always a palindrome
            return true;
        }
        int last = a % 10;// extract the last digit
        int divisor = 1;//divisor is to find how much 0's we want to find the first digit by dividing them with number
        int first = a;//to get the first digit
        while (first >= 10) {
            divisor *= 10;//for every digit lost , a divisor 0 is gained
            first /= 10;//dont forget to update the number
        }
        //the first digit is derived
        //divisor is derived
        //compare the first and last digit
        if (first != last) {
            return false;
        }
        a=(a%divisor)/10;//removing first and last digit
        return palindrome(a);//this is a recursion function

    }
    //method3 to find perfect number
    //A Perfect Number is a positive integer that is equal to the sum of all its proper divisors (divisors excluding the number itself).
    //ex: 6 (its divisors are 1 , 2 , 3)(1+2+3=6)#6is a perfect number
    //ex: 28 (its divisors are 1 , 2 , 4 , 7 , 14 )(1+2+4+7+14=28)#28 is a perfect number
    static boolean perfect(int a){
        int sum = 0 ;
        for(int i = 1 ; i<a ; i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if (sum==a){
            return true ;
        }
        else {
            return false ;
        }
    }
    //method4 to find strong number
    //A Strong Number is a number whose sum of the factorials of its individual digits is equal to the original number.
    static boolean strong(int a){
        int numtest = a;
        int sum = 0 ;
        while(a>0){
            int digit = a%10;
            sum+=fact(digit);
            a/=10;
        }
        if (sum==numtest){
            return true ;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        if((amstrong(153))==true){
            System.out.println("Amstrong number .");
        }
        else {
            System.out.println("not an amstrong number .");
        }
        if ((palindrome(121))==true){
            System.out.println("palindrome .");
        }
        else {
            System.out.println("not a palindrome .");
        }
        if ((perfect(28))==true){
            System.out.println("perfect number .");
        }
        else {
            System.out.println("not a perfect number .");
        }
        if ((strong(145))==true){
            System.out.println("strong number .");
        }
        else {
            System.out.println("not a strong number .");
        }
    }
}
