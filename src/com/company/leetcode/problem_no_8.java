package com.company.leetcode;

public class problem_no_8 {
    public int myAtoi(String str){
        if (str == null || str.length() == 0) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        long result = 0;

        // Skip leading white spaces
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        // Check for sign
        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = (str.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Process remaining digits
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

            result = result * 10 + digit;

            // Check for overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (result * sign);
    }
}
