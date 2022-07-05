package com.adda52.learning;

public class VarArgsImplementation {
    //method to handle variables
    public static void sum(int... a ) {
        int sum = 0;
        System.out.println("sum(args):");
        for(int i: a)
            sum += i;
        System.out.println(sum);
    }

    //This willl show multiple variables
    public static void sum2(String name, int... a){
        System.out.println("Hello, This is Type of Multiple variables!");
        for(int i: a){
            System.out.println(" " + i);
        }
    }


    public static void main(String[] args) {
        sum(1,2,3,4);
    }
}
