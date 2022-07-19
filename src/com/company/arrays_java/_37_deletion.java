package com.company.arrays_java;

public class _37_deletion {
    public int[] delete(int index,int[] array){
        int[] new_array= new int[array.length-1];
        if(array==null|| index<0 || index>= array.length){
            return array;
        }

        for(int i=0,k=0;i< array.length;i++){
            if(i==index){
                continue;
            }
            new_array[k++]=array[i];
        }
        return new_array;
    }

    public static void main(String[] args) {
        _37_deletion ob = new _37_deletion();
        int[] a= {1,2,3,4,5,6,7,8,9,10};
        int[] ans= ob.delete(3,a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

}
