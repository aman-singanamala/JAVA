package com.company.leetcode;

public class problem_no_66 {
    public int[] plusOne(int[] digits){
        int a= array_to_digit(digits);
        a=a+1;
        int[] ans=digit_to_array(a);
        return ans;
    }
    public int array_to_digit(int[] array){
        int digit=0;
        int k=1;
        for(int i=0;i<array.length;i++){
            digit=digit*10+array[i];
        }
        return digit;
    }
    public int[] digit_to_array(int digit){
        String temp= Integer.toString(digit);
        int[] numbers=new int[temp.length()];
        for(int i=0;i<temp.length();i++){
            numbers[i]=temp.charAt(i)-'0';
        }
        return numbers;
    }
    public static void main(String[] args) {
         problem_no_66 ob= new problem_no_66();
         int[] a={1,2,3};
         int[] ans=ob.plusOne(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
