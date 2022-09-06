package com.company.Random_Practice.EXAM_PREP;
public class xylem_phloem {
    public static boolean func(int n){
        int outersum= 0;
        int innersum=0;
        int temp= n;
        while(temp!=0){
            if(temp== n || temp<10){
                outersum= outersum+ n%10;
            }
            else{
                innersum= innersum+ n%10;
            }
            temp=temp/10;
        }
        if(outersum== innersum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean ans = func(1223);
        if(ans==true){
            System.out.println("Xylem Number");
        } else if (ans==false) {
            System.out.println("Phloem number");
        }
    }
}
