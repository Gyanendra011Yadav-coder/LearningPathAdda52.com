package com.adda52.learning.wrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Integer Value
        int value = 102830;
        System.out.println("This is the int Value:"+value);
        Integer value2 =Integer.valueOf(value);
        System.out.println("This is the Integer Value:"+value2);

        Integer value3 = new Integer(102830);
        int value4=value3.intValue();
        System.out.println("This is the int Value Converted from Integer:"+value4);

        //Character Value
        int characters = 'm';
        System.out.println("This is the int Value:"+value);
        Character characters2 =Character.valueOf((char) characters);
        System.out.println("This is the Integer Value:"+value2);
    }
}
