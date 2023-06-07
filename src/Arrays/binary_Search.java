package Arrays;

import java.util.Arrays;

public class binary_Search {
    static int search(int[] array , int target){
        Arrays.sort(array);
        int start=0;
        int end= array.length-1;
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(array[mid]==target){
                return mid;
            } else if (array[mid]<target) {
                start=mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,77};
        int ans= search(arr, 4);
        if(ans==-1)
            System.out.println("ELEMENT NOT FOUND");
        else System.out.println("ELEMENT FOUND AT "+ans+" INDEX");
    }
}
