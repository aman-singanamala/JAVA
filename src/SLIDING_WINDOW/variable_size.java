package SLIDING_WINDOW;

import java.util.HashMap;

public class variable_size {
    public static int minSubArrayLen(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+= nums[j];
                if(sum>= target){
                    minLength= Math.min(minLength, j-i+1);
                    break;
                }
            }
        }

        if(minLength!=Integer.MAX_VALUE){
            return minLength;
        }else{
            return 0;
        }
    }


//    public static int lengthofLongestsubstring(String s){
//
//    }
}
