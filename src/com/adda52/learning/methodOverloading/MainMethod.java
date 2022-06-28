package com.adda52.learning.methodOverloading;

public class MainMethod {
    public static void main(String[] args) {
        Customer obj = new Customer();
        System.out.println(obj.welcomeCustomer("Gyan"));
        System.out.println(obj.welcomeCustomer("Gyan",21));
    }
}
