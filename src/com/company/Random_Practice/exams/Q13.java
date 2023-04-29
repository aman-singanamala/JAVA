package com.company.Random_Practice.exams;
import java.util.Scanner;
class MyCalculator{
    public long power(int n, int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative");
        } else if (n==0 && p==0) {
            throw new Exception("n and p should not be zero");
        }else{
            return (long)Math.pow(n,p);
        }
    }
}
public class Q13 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int p= in.nextInt();
        try {
            long result= calculator.power(n,p);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}