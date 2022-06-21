package com.adda52.learning.ConstructorStaticAndInstanceBlocks;

//This is Simply Non-Static Methods

/***
 * These are the normal methods of a class (non static), you need to invoke them using an object of the class −
 */
public class InstanceBlocks {
    public void nonStaticMethod(){
        System.out.println("This is Non-Static Method Called....");
    }

    public static void main(String[] args) {
        //We can not call Non-Static Method Directly
        InstanceBlocks obj=new InstanceBlocks();
        obj.nonStaticMethod();
    }
}
