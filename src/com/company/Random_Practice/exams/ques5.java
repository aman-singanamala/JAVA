package com.company.Random_Practice.exams;

interface Arthemetic{
    int divisor(int n);
}


class Mycalc implements Arthemetic{
    public int divisor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
public class ques5 {
    public static void main(String[] args) {
        Mycalc mc = new Mycalc();
        System.out.println(mc.divisor(8));
    }
}
