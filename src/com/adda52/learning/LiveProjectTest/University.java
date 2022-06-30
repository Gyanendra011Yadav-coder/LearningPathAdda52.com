package com.adda52.learning.LiveProjectTest;

import com.adda52.learning.associationandaggregation.composition.Library;
import com.google.gson.Gson;

public class University {
//    Library library = new Library("Rich Dad Poor Dad","Robert Keyoski",1,001);

    public static void main(String[] args) {
        //Creating an object Of Gson
        Gson gson=new Gson();
        //String jsonFile= gson.toJson(library);
        //or gson.toJson(new Library("Rich Dad Poor Dad","Robert Keyoski",1,001));
        //System.out.println(jsonFile);

        /**
         * Converting Data From JSON to Object
         */
        System.out.println("Converting Data from JSON To Java Object:-");
        String json="{\"bookName\":\"Earth Suffering\",\"authorName\":\"Gyanendra-Yadav\",\"id\":2,\"serialNumber\":002}";
        /**
         * Library{
         *     bookName: Rich Dad Poor Dad
         *     authorName: RObwrt Keyoski
         *     id: 1
         *     serialNumber: 1
         * }
         */

    }
}
