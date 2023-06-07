package Strings;

public class reverseWords {
    static String function(String S){
        String[] str= S.split("\\.");
        int n= str.length;
        for(int i=0;i<n/2;i++){
            String temp= str[i];
            str[i]= str[n-i-1];
            str[n-i-1]= temp;
        }

        StringBuilder ans= new StringBuilder();
        for (String s : str) {
            ans.append(s).append(".");
        }

        return ans.substring(0,ans.length()-1);
    }

    public static void main(String[] args) {
        String S= "i.like.this.program.very.much";
        String ans= function(S);
        System.out.println(ans);
    }
}
