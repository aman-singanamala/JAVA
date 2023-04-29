package com.company.Random_Practice.exams;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

        String fd= Integer.toString(num).substring(0,1);
        int firstdigit= Integer.parseInt(fd);

        int lastdigit= num%10;
        int digit= firstdigit*10+lastdigit;

        if(num%digit==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}