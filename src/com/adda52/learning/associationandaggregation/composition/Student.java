package com.adda52.learning.associationandaggregation.composition;

import com.adda52.learning.associationandaggregation.composition.Library;
import com.google.gson.Gson;

public class Student {
    public static Library getBook(Library book){
        book.bookName="Robert Keyoski";
        book.authorName="Robert Keyoski";
        book.id=1;
        book.serialNumber=001;
        return book;
    }

    public static void main(String[] args) {
        Library obj = new Library();
        obj=getBook(obj);
        System.out.println(new Gson().toJson(obj));
    }
}
