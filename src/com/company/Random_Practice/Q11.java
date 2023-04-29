package com.company.Random_Practice;
import java.util.*;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        Base64.Encoder encoder= Base64.getMimeEncoder();
        String message= ip.next();
        String eStr= encoder.encodeToString(message.getBytes());
        System.out.println(eStr);
    }
}