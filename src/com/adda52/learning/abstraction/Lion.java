package com.adda52.learning.abstraction;

class Lion extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Lion Roars....");
    }
    @Override
    public void sleep() {
        super.sleep();
    }
}
