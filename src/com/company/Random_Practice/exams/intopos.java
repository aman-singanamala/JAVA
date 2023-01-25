package com.company.Random_Practice.exams;

import java.util.*;

public class intopos {
    public static boolean isOperator(char c){
        return c=='+' ||
                c== '-' ||
                c== '/' ||
                c=='^' ||
                c== '*';

    }
    public static int getPrecedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }


    public static String infixToPostfix(String expression) {
        String result = ""; // Initialize empty output string
        Stack<Character> stack = new Stack<>(); // Initialize empty stack

        // Iterate through each character in the infix expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                // If the character is a letter or digit, add it to the output string
                result += c;
            } else if (c == '(') {
                // If the character is a left parenthesis, push it onto the stack
                stack.push(c);
            } else if (c == ')') {
                // If the character is a right parenthesis, pop operators from the stack and add them to the output string
                // until a left parenthesis is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    // If there is no matching left parenthesis, the expression is invalid
                    return "Invalid Expression";
                } else {
                    // If a left parenthesis is found, pop it from the stack and discard it
                    stack.pop();
                }
            } else if (isOperator(c)) {
                // If the character is an operator, pop operators from the stack with higher or equal precedence
                // and add them to the output string, then push the current operator onto the stack
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        // After iterating through the entire expression, pop any remaining operators from the stack and add them to the output string
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "(A+B) * (C+D)";
        System.out.println(infixToPostfix(expression));
    }

}
