package com.company.leetcode;

public class problem_no_2114 {
    public int countWords(String sentence) {
        int n= sentence.length();
        if(n==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(sentence.charAt(i)==' '){
                count++;
            }
        }
        return count+1; // for n spaces there will be n+1 words in a sentence
    }
    public int maxWordsFound(String[] sentences){
        int maxWords=0;
        for(int i=0;i< sentences.length;i++){
            int x= countWords(sentences[i]);
            if(x>maxWords){
                maxWords=x;
            }
        }
        return maxWords;
    }

    public static void main(String[] args) {
        String[] a= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        problem_no_2114 ob = new problem_no_2114();
        int ans= ob.maxWordsFound(a);
        System.out.println(ans);
    }
}
