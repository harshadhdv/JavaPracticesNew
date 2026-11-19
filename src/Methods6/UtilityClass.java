package Methods6;
//47. Create a utility class containing static methods for:
//- Checking even or odd.
//- Finding maximum.
//- Calculating factorial.
//- Checking prime numbers.

//every class should be static
//every class should have return value
public class UtilityClass {
    //method to find even or odd
    static boolean eveodd(int a){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    //method to fing maximum
    static int maximum(int...nums){
        int count = nums.length;
        int hi = 0 ;
        for (int i = 0 ; i<count ; i++){
            for (int j = 1 ; j<count;j++){
                if(nums[i]>nums[j]&&nums[i]>hi){
                    hi = nums[i];
                }
                else if (nums[j]>nums[i]&&nums[j]>hi) {
                    hi = nums[j];
                }
            }
        }
        return hi;
    }
    //method to calculate factorial
    static int factorial(int a){
        if(a==0){
            return 1;
        }
        return a*factorial(a-1);
    }
    //method to check prime
    static boolean isprime(int a){
        int count = 0;
        for (int i = 1 ; i<=a ; i++){
            if(a%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        if ((eveodd(4)==true) ){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        if ((eveodd(7)==true)){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        System.out.println("maximum : " + maximum(34,56,23,76,83,47,67));
        System.out.println(factorial(5));
        if (isprime(7)==true){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
