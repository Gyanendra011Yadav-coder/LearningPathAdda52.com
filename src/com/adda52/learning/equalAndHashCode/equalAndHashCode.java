package com.adda52.learning.equalAndHashCode;

public class equalAndHashCode {
    public static void main(String[] args){
        String a = "Gyan";
        String b = "Gyan";

        if(a.equals(b)){
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());

        }

        String c = "Gyanendra";
        String d= "Ankit";

        if(!c.equals(a)){
            System.out.println("\nc & a  are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + a.hashCode());

        }

        if(!c.equals(d)){
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());

        }
    }
}
