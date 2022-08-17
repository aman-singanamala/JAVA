package com.company.Random_Practice;

public class rotation {
    public int[] rotate(int[] array){
        int start=0;
        int end= array.length-1;
        while(start!=end){
            int temp=array[start];
            array[start]= array[end];
            array[end]=temp;
            start++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        rotation ob = new rotation();
        int[] ans = ob.rotate(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
