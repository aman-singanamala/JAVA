package com.company.Random_Practice.EXAM_PREP;


import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the alphabet : ");
        char input;
        input= in.next().charAt(0);
         switch (input){
             case 'a':
                 System.out.println("Vowel");
                 break;
             case 'e':
                 System.out.println("Vowel");
                 break;
             case 'i':
                 System.out.println("Vowel");
                 break;
             case 'o':
                 System.out.println("Vowel");
                 break;
             case 'u':
                 System.out.println("Vowel");
                 break;
             case 'A':
                 System.out.println("Vowel");
                 break;
             case 'E':
                 System.out.println("Vowel");
                 break;
             case 'I':
                 System.out.println("Vowel");
                 break;
             case 'O':
                 System.out.println("Vowel");
                 break;
             case 'U':
                 System.out.println("Vowel");
                 break;

             default:
                 System.out.println("Consonant");
         }
    }
}
