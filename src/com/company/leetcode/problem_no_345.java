package com.company.leetcode;

public class problem_no_345 {
    public String reverseVowels(String s){
        int n= s.length();
        int i=0;
        int j=n-1;
        char[] arr= s.toCharArray();
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
                continue;
            }
            if(!isVowel(arr[j])){
                j--;
                continue;
            }
            // swapping
            char temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String ans= "";
        for (int k = 0; k < arr.length; k++) {
            ans= ans+arr[k];
        }
        return ans;
    }
    static boolean isVowel(char c){
        return (c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'
                ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }

    public static void main(String[] args) {
        problem_no_345 ob = new problem_no_345();
        String ans= ob.reverseVowels("leetcode");
        System.out.println(ans);
    }

}