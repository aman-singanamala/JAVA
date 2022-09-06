package com.company.recursion;
import java.lang.*;
import java.util.*;
public class a {
    public static int count =0;
    public static void main(String[] args){
        //func();
        //printname(1,5);
        //print1_n(1,5);
        printn_1(5,5);

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

}
