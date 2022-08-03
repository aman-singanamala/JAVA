package com.company.TwoPointer;



public class reverse_char_string {
    public void reverseString(String[] s){
        int n= s.length;
        int i=0;
        int j=n-1;
        while(i<j){
            String temp= s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k]+" ");
        }
    }

    public static void main(String[] args) {
        String[] a= {"h","e","l","l","o"};
        reverse_char_string ob = new reverse_char_string();
        ob.reverseString(a);
    }
}
