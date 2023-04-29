package com.company.Random_Practice.exams;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int[] arr= new int[5];
        int x,y;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i]= in.nextInt();
        }

        x= in.nextInt();
        y=in.nextInt();
        try{
            System.out.println(arr[x]/arr[y]);
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index must be in 0 to 4");
        }catch (Exception e){
            System.out.println("unknown exception");
        }
    }
}