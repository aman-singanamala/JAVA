package com.company.leetcode;

public class problem_no_1859 {
    public String sortSentence(String s){
        String array[] = s.split(" "); // convert the string into array inoring spaces
        String temp[]= new String[array.length];
        String result="";
        for(int i=0;i<array.length;i++){
            // get the number at last index of the string
            int index= array[i].charAt(array[i].length()-1)-'0';
            //putting the string into temp
            temp[index-1]= array[i].substring(0,array[i].length()-1);
        }
        for(int i=0;i< temp.length;i++){
            result=result+temp[i]+" ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        problem_no_1859 ob= new problem_no_1859();
        String ans= ob.sortSentence("is2 sentence4 This1 a3");
        System.out.println(ans);
    }

    // array[]= 1,2,3,4
    // temp[]= 0 1 2 3
}

//temp[0]= "This"
//temp[1]= "is"
//temp[2]= "a"
//temp[3]= "sentence"

