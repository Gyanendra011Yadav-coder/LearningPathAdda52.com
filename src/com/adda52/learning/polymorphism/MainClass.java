package com.adda52.learning.polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Animal animalObject=new Animal();
        Cat catObject=new Cat();
        Dog dogObject=new Dog();
        Horse horseObject=new Horse();
        System.out.println("This is actually Run-Time_Polymorphism...");
        animalObject.doEatMeat();
        catObject.doEatMeat();
        dogObject.doEatMeat();
        horseObject.doEatMeat();
        System.out.println("This is the example of -> 'Compile Time Polymorphism.....!'");
        animalObject.doSleep();
        animalObject.doSleep("Monkey");
    }
}
