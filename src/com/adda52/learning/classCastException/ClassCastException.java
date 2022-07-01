package com.adda52.learning.classCastException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassCastException {
    public static void main(String[] args) {
        String[]array={"Gyan","Gyanendra","Ankit", "Gyanu", "Man"};
        /**
         * Will be Showing error when we will try to convert it:
         * ArrayList<String> list=(ArrayList<String>) Arrays.aslist(array);
         * ->static method Arrays.asList() returns a List,
         * ->When the code runs, the actual implementation is checked which finds that Arrays.asList()
         * returns an Arrays$List thus causing a ClassCastException.
         */
        List<String> listCoonvertedFromArray=  Arrays.asList(array);
        for(String st:listCoonvertedFromArray){
            System.out.println(st);
        }
    }
}
