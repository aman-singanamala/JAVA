package com.company.leetcode;

public class problem_no_1108 {
    public String defangIPaddr(String address){
            if(address==null||address.indexOf('.')<0){
                return address;
            }
            else{
                return address.replaceAll("\\.","[.]");
            }
    }
}
