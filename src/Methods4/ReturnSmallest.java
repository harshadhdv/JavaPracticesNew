package Methods4;

import java.util.Scanner;

//27. Write a method that accepts multiple integers and returns the smallest number.
public class ReturnSmallest {
    public static int smallest(int...nums){
        int count = nums.length;
        int small = nums[1] ;
        for(int i = 0 ; i<count;i++){
            for (int j = 1 ; j<count;j++){
                if(nums[i]<nums[j]&&nums[i]<small){
                    small=nums[i];
                } else if (nums[j]<nums[i]&&nums[j]<small) {
                    small=nums[j];

                }
            }
        }
        return small;
    }
    public static void main(String[] args){
        System.out.println(smallest(4,11,15,2));
        System.out.println(smallest(2004,2005,4114,1502));
        System.out.println(smallest(20,4,20,5,4,11,5));
    }
}
