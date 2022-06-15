package com.adda52.learning.abstraction;

public abstract class Animal {
    //Abstract method-> This Method are whose declaration is in Parent class but implementaion is in sub-classes
    public abstract void  animalSound();
    //Simple Method can also be Declared in Abstract method
    public void sleep(){
        System.out.println("Animals Do Sleep......");
    }
}
