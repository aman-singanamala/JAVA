package com.company.arrays_java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _17_convert_array_to_arraylist {
    public static void main(String args[]){
        String[] array= new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
        ArrayList<String> list= new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}
