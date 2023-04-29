package com.company.Random_Practice.exams;
import java.util.Scanner;
class DivisibleFiveException extends Exception{
    public DivisibleFiveException(String message){
        super(message);
    }
}
public class Q7 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        num= in.nextInt();
        try{
            if(num%5==0){
                throw new DivisibleFiveException("Number should not be divided by five");
            }else System.out.println("Valid Number");
        }catch (DivisibleFiveException e){
            System.out.println(e.getMessage());
        }
    }
}