package com.adda52.learning.associationandaggregation.aggregtion;



public class main {
    public static void main(String[] args) {
        Car car=new Car("Oddi", 100, "qasdr");
        Driver driver=new Driver("Gyan");
        System.out.println(driver.getName()+",is Driving"+" "+car.getName()+" "+",Module:"+car.getModel()+" "+", at speed of:"+car.getSpeed());
    }
}
