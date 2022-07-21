package com.adda52.learning.equalAndHashCode;

public class EmployeeWithOwnHashAndEqualsMethod {
    String empFirstName;
    String empLastName;
    int empAge;
    int empId;

    public EmployeeWithOwnHashAndEqualsMethod(String empFirstName, String empLastName, int empAge,int empId) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empAge = empAge;
        this.empId = empId;
    }

    //We can return any value that we want to return

    @Override
    public int hashCode() {
      return this.empId;
      // return 4567890-63*4;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj==null && obj.getClass() != this.getClass()){
            return false;
        }
        EmployeeWithOwnHashAndEqualsMethod object = (EmployeeWithOwnHashAndEqualsMethod) obj;
        return object.empFirstName==this.empFirstName && object.empLastName==this.empLastName;
    }
}
