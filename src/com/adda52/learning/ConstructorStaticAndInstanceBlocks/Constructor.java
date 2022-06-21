package com.adda52.learning.ConstructorStaticAndInstanceBlocks;

/**
 * A constructor is similar to method and it is invoked at the time creating an object of the class,
 * it is generally used to initialize the instance variables of a class.
 * The constructors have same name as their class and, have no return type.
 */
public class Constructor {
    int num1;
    int num2;
    public Constructor(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        System.out.println("I Have Updated The Values Using Constructor...."+num1+","+num2);
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor(1,2);
    }
}
