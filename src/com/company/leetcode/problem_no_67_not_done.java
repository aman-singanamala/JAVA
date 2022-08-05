package com.company.leetcode;

public class problem_no_67_not_done {
    public String addBinary(String a,String b){
        long A = Integer.parseInt(a);
        long B=  Integer.parseInt(b);
        int m= convertB_D(A);
        int n=convertB_D(B);
        long ans = convertD_B(m+n);

        return Integer.toString((int) ans);

    }
    static int convertB_D(long binary){
        int i=0;
        int ans=0;
        while(binary>0){
            ans= (int) (ans+((binary%10)*Math.pow(2,i)));
            i=i+1;
            binary=binary/10;
        }
        return ans;
    }
    static long convertD_B(int num){
        int i=0;
        long ans=0;
        while(num>0){
            ans= (long) (ans+ ((ans%2)*Math.pow(10,i)));
            i++;
            num=num/10;
        }
        return ans;
    }

    public static void main(String[] args) {
    problem_no_67_not_done ob = new problem_no_67_not_done();


    }
}
