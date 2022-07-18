package com.adda52.learning.Enum;

public class TestEnum {
    public static void main(String[] args) {
       Months monthName=Months.JULY;
       Months[] arr=Months.values();       //Using methos of enumeration -> .values() method
        //using Method of Enumeration .valueOf() method
        System.out.println("Applying 3rd Method of Enumeration");
        try {
            Months.valueOf("December");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception"+e);
        } finally {
            System.out.println("Finally called"+" "+Months.valueOf("DECEMBER"));
        }
        //Simply Creating Method to print
        for (Months value : arr) {
           System.out.println(value);
       }
       //Using Ordinal Method
        System.out.println("Applying Ordinal Method:");
        for (Months value : arr) {
            System.out.println(value.ordinal());
        }
    }
}
