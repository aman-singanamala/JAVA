package com.company.recursion;

public class _12_rotated_binary_search {
    static int search(int[] array,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m= s=(e-s)/2;
        if(array[m]==target){
            return m;
        }
        // if first half is sorted
        // two cases:
        // (i) whether the target lie in first half or not
        if(array[s]<=array[m]){
            if (target>=array[s]&& target<=array[m]){
                return search(array,target,s,m-1); // first half
            }
            else{
                return search(array, target, m+1, e); // second half
            }
        }
        if(target>=array[m] && target<=array[e]){
            return search(array, target, m+1, e);
        }
        return search(array, target, s, m-1);
    }

    public static void main(String[] args) {
        int[] a={5,6,7,8,9,1,2,3};
        System.out.println(search(a,8,0,a.length-1));
    }
}
