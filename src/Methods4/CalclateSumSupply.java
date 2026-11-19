package Methods4;

import java.util.Scanner;

//29. Create a calculator method using varargs that calculates the sum of all supplied numbers.
public class CalclateSumSupply {
    public static int sum(int...nums){
        int sumall=0;

        for(int num : nums){
            sumall=sumall+num;
        }
        return sumall;
    }
    public static void main(String[] args) {
        System.out.println(sum(4114,1502,41104,150205));
        System.out.println(sum(4,11,4,15,2,5));
        System.out.println(sum(6,3,0,6));
    }
}
