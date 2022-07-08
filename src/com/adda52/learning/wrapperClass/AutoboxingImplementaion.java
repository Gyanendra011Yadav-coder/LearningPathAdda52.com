package com.adda52.learning.wrapperClass;

public class AutoboxingImplementaion {
    public static void main(String[] args) {
        int i = 100;
        Double d= Double.valueOf(i);
        Integer j = i;
        String s=String.valueOf(i);
        System.out.println(returnWrapperInt(i));
        System.out.println(returnWrapperDouble(i));
    }

    public static Integer returnWrapperInt(int i) {
        return i;
    }

    public static Double returnWrapperDouble(int i) {
        return Double.valueOf(i);
    }
}
