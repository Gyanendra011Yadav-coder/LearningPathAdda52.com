package com.adda52.learning.staticAndDynamicBinding;

public class main {
    public static void main(String[] args) {
        System.out.println("Example Of Static Binding,That is Binding At the Time Of Compile Time:-");
        User user = new User();
        user.show();

        System.out.println("Example Of Dynamic Binding,That is Binding At the Time Of Compile Time later Identityfied by JVM After Compile:-");
        User customer=new Customer();
        customer.show();
    }
}
