package com.adda52.learning.ConstructorStaticAndInstanceBlocks;

/***
 * A static block is a block of code with a static keyword. In general, these are used to initialize the static
 * members of a class.
 * JVM executes static blocks before the main method at the time loading a class.
 */
public class StaticBlocks {
   public static void staticPrint(){
       System.out.println("Hello This Is Static Block....");
    }

    public static void main(String[] args) {
        staticPrint();
    }
}
