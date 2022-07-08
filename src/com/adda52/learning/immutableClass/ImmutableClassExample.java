package com.adda52.learning.immutableClass;

public final class ImmutableClassExample {
    private final String studentName;
    private final int age;


    public ImmutableClassExample(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutableClassExample obj=new ImmutableClassExample("Alice", 1);
        System.out.println(obj.getStudentName());
        System.out.println(obj.getAge());
    }
}
