package com.company.arrays_java;

public class _36_insertion {
    public int[] insert(int num,int[] array,int pos){
        int[] newarray=new int[array.length+1];
        for (int i = 0; i < newarray.length; i++) {
            if(i<pos-1){
                newarray[i]= array[i];
            } else if (i==pos-1) {
                newarray[i]=num;
            }
            else{
                newarray[i]=array[i-1];
            }
        }


    return newarray;
    }

    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        _36_insertion ob= new _36_insertion();
        int[] ans= ob.insert(50,arr,5);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
