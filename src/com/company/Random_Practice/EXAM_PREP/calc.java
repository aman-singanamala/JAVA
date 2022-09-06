package com.company.Random_Practice.EXAM_PREP;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Choose an operator : +,-,/,*");
        operator= in.next().charAt(0);
        System.out.println("Enter the number 1:");
        number1=in.nextDouble();
        System.out.println("Enter the number 2:");
        number2=in.nextDouble();

        switch (operator){
            case '+':
                result=number1+number2;
                System.out.println("Sum of "+ number1+" and "+number2+" is "+result);
                break;
            case '-':
                result=number1-number2;
                System.out.println("Sub of "+ number1+" and "+number2+" is "+result);
                break;
            case '*':
                result=number1*number2;
                System.out.println("Mul of "+ number1+" and "+number2+" is "+result);
                break;
            case '/':
                result=number1/number2;
                System.out.println("Div of "+ number1+" and "+number2+" is "+result);
                break;
        }
        in.close();
    }
}
