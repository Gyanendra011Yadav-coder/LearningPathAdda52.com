package com.adda52.learning.serializationAndDeserialization;

public class Employee {
    public static final long serialVersionUID = 1L;
    String empName;
    int empId;
    int empAge;
    String empAddress;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Employee(String empName, int empId, int empAge, String empAddress) {
        this.empName = empName;
        this.empId = empId;
        this.empAge = empAge;
        this.empAddress = empAddress;
    }

    public static void writeObject(Employee employee){
        System.out.println(employee.getEmpName());
        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpAge());
        System.out.println(employee.getEmpAddress());
    }

}
