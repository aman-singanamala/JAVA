package com.company.Random_Practice.exams;

import java.util.Scanner;

class IncorrectAgeException extends Exception{
    public IncorrectAgeException(String message){
        super(message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int age= in.nextInt();
            if(age>150){
                throw new IncorrectAgeException("Please Enter Correct Age");
            }else
                System.out.println("Welcome");


        }catch (IncorrectAgeException e){
            System.out.println(e.getMessage());
        }
    }
}