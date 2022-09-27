package com.company.Random_Practice;

public class reversewords {
    static String reverse1(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans=ans+str.charAt(i);
        }
        return ans;
    }
    static String reverse2(String str){
        int n= str.length();
        char[] ch= str.toCharArray();
        for(int i=0;i<n/2;i++){
            char temp= ch[i];
            ch[i]= ch[n-i-1];
            ch[n-i-1]= temp;
        }
        String ans = new String(ch);
        return ans;
    }
    static String reverseString(String s){
        s.trim();
        String ans= "";
        String[] array = s.split(" ");
        for(int i=array.length-1;i>=0;i--){
            ans= ans+array[i]+" ";
        }
        return ans.trim();
    }
    public static void main(String[] args){ 
        String a="Aman Singanamala aman aaa";
        String ans= reverseString(a);
        System.out.println(ans);

    }

}
