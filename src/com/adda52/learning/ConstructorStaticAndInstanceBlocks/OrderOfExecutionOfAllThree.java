package com.adda52.learning.ConstructorStaticAndInstanceBlocks;

/***
 * When you have all the three in one class,
 * 1)the static blocks are executed first,
 * 2)followed by constructors and
 * 3)then the instance methods.
 */
public class OrderOfExecutionOfAllThree {
    OrderOfExecutionOfAllThree(){
        System.out.println("Hello There This Is Constructor....");
    }
    static {
        System.out.println("Hello, There This Is Static Method....");
    }
    public void instanceMethod(){
        System.out.println("Hello, There This Is Non-Static Method....");
    }

    public static void main(String[] args) {
        new OrderOfExecutionOfAllThree().instanceMethod();

    }
}
