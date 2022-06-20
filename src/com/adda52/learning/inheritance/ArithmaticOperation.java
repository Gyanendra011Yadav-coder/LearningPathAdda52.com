package com.adda52.learning.inheritance;


//Extends-> Keyword is used to inherit all the properties of ParentClass to SubClass
public class ArithmaticOperation extends MathematicsOpertaions{
    public static void main(String[] args) {
        ArithmaticOperation objectArithmaticOperationClass = new ArithmaticOperation();
        System.out.println(objectArithmaticOperationClass.addition(1,2));
        System.out.println(objectArithmaticOperationClass.subtract(1,2));
        System.out.println(objectArithmaticOperationClass.multiplication(1,2));
        System.out.println(objectArithmaticOperationClass.division(1,2));
    }
}
