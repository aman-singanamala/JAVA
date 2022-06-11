package com.company.leetcode;

public class problem_no_1528 {
    public String restoreString(String s, int[] indices){
        char[] array= new char[indices.length];
        for(int i=0;i< indices.length;i++){
            array[indices[i]]=s.charAt(i);
        }
        return new String(array);
    }
    public static void main(String[] args) {
        int[] a={4,5,6,7,0,2,1,3};
        String str= "codeleet";
        problem_no_1528 ob= new problem_no_1528();
        String ans= ob.restoreString(str,a);
        System.out.println(ans);
    }
}
