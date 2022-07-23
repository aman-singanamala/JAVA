package com.company.recursion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class _11_array_list {
      static ArrayList<Integer> findAllIndex(int[] array,int target,int index,ArrayList<Integer> list){
          if(index== array.length){
              return list;
          }
          if(array[index]==target){
              list.add(index);
          }
          findAllIndex(array,target,index+1,list);
          return list;
      }
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,4,8,9,4};
        ArrayList<Integer> ans= findAllIndex(a,4,0,new ArrayList<>());
        System.out.println(ans);
    }

}
