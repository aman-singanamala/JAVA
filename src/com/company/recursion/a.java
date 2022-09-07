package com.company.recursion;
import java.lang.*;
import java.util.*;
public class a {
    public static int count =0;
    public static void main(String[] args){
        //func();

        //printname(1,5);

        //print1_n(1,5);

        //printn_1(5,5);

        //print1nbackttacking(5,5);

        //sum(5,0);

        /* For printing sum using function returning
        int ans=sum_1_n(5);
        System.out.println(ans); */

        /*int ans=fact(6);
        System.out.println(ans);*/

        // REVERSE AN ARRAY USING TWO POINTERS
        /*int[] a={1,2,3,4,5};
        reverse(0,a.length-1,a);
        printarray(a); */

        // REVERSE AN ARRAY USING SINGLE POINTER
        /* int[] a= {1,2,3,4,5};
        reverse_1(0,a);
        printarray(a);*/

        // CHECK IS A STRING IS PALINDROME
        /*boolean ans= palindrome(0,"madama");
        System.out.println(ans);*/


    }
    public static void func(){

        if(count==4){
            return ;
        }
        else{
            System.out.println(count);
            count++;
        }
        func();
    }


    public static void printname(int i,int n){
        String name= "Aman";
        if(i>n){
            return ;
        }
        else{
            System.out.println(name);
            printname(i+1,n);
        }
    }


    public static void print1_n(int i,int n){
        if(i>n){
            return ;
        }
        else{
            System.out.println(i);
            print1_n(i+1,n);
        }
    }


    public static void printn_1(int i,int n){
        if(i<1){
            return ;
        }
        else{
            System.out.println(i);
            printn_1(i-1,n);
        }
    }


    public static void print1nbackttacking(int i,int n){
        if(i<1){
            return ;
        }
        else{
            print1nbackttacking(i-1,n);
            System.out.println(i);
        }
    }


    public static void sum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return ;
        }
        else{
            sum(i-1,sum+i);
        }
    }


    public static int sum_1_n(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sum_1_n(n-1);
        }
    }


    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }


    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b= temp;

        System.out.print(a + " "+ b);
    }


    public static void printarray(int[] A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }


    // REVERSE AN ARRAY USING TWO POINTERS
    public static void reverse(int l,int r,int[] A){
        if(l>=r){
            return ;
        }
        int temp;
        temp=A[l];
        A[l]=A[r];
        A[r]= temp;
        reverse(l+1,r-1,A);

    }


    // REVERSE AN ARRAY USING A SINGLE POINTER
    public static void reverse_1(int i,int[] A){
         if(i>=A.length/2) {
             return ;
         }
         int temp;
         temp=A[i];
         A[i]= A[A.length-i-1];
         A[A.length-i-1]=temp;
         reverse_1(i+1,A);
    }

    // CHECK IS A STRING IS PALINDROME
    public static boolean palindrome(int i, String str){
        if(i>= str.length()/2){
            return true;
        }
        if(str.charAt(i)!= str.charAt(str.length()-i-1)){
            return false;
        }
         return palindrome(i+1,str);
    }
}
