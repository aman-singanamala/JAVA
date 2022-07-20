package com.company.leetcode;
public class problem_no_1662 {
    public boolean arrayStringAreEqual(String[] word1,String[] word2){
        boolean ans=true;
        String res1="";
        String res2="";
        for (int i = 0; i < word1.length; i++) {
            res1=res1+word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            res2=res2+word2[i];
        }
        if(res1.equals(res2)){
            return ans;
        }
        return false;
    }
    public static void main(String[] args) {
        problem_no_1662 ob = new problem_no_1662();
        String[] w1= {"ab", "c"};
        String[] w2= {"a", "bc"};
        boolean a= ob.arrayStringAreEqual(w1,w2);
        System.out.println(a);
    }
}
