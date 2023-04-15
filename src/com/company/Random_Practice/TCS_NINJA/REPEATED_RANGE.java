package com.company.Random_Practice.TCS_NINJA;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class REPEATED_RANGE {
    public static boolean check(int n){
        LinkedHashSet<Integer> s= new LinkedHashSet<>();
        while(n>0){
            int r= n%10;

            if (s.contains(r)) {
                return false;
            }
            s.add(r);
            n = n/10;
        }
        return true;
    }
    public static int rangegiven(int n1, int n2){
        int count=0;
        for(int i=n1;i<=n2;i++){
            boolean ans = check(i);
            if(ans){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();

        int ans= rangegiven(n1, n2);
        System.out.println(ans);
    }
}