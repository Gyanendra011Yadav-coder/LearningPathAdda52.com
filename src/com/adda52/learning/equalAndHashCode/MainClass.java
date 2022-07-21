package com.adda52.learning.equalAndHashCode;

public class MainClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Gyanendra", "Yadav", 21);
        Employee employee2 = new Employee("Gyanendra", "Yadav", 21);
        //Employee employee2 = employee1;
        if (employee1.hashCode() == employee2.hashCode()) {
            if (employee1.equals(employee2))
                System.out.println("Employee hashCode match");
            else
                System.out.println("Employee hashCode not match");
        }else
            System.out.println("Employee not equal as");
            System.out.println(employee1.hashCode());
            System.out.println(employee2.hashCode());


        /***
         * Here, we will be checking with the owm implementated of equLS and hashCode methods
          */
        System.out.println("Now, Start Using Class Having own  Equals and HashCode implementations:");
        EmployeeWithOwnHashAndEqualsMethod employee3= new EmployeeWithOwnHashAndEqualsMethod("Gyanendra", "Yadav", 21, 191500309);
        EmployeeWithOwnHashAndEqualsMethod employee4= new EmployeeWithOwnHashAndEqualsMethod("Gyanendra", "Yadav", 21, 191500309);
        if (employee3.hashCode() == employee4.hashCode()) {
            if (employee3.equals(employee4))
                System.out.println("Employee hashCode match");
            else
                System.out.println("Employee hashCode not match");
        }else
            System.out.println("Employee not equal as");
        System.out.println(employee3.hashCode());
        System.out.println(employee4.hashCode());
    }
}
