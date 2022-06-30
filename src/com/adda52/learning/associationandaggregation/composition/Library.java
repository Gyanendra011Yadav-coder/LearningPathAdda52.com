package com.adda52.learning.associationandaggregation.composition;

public class Library {
    String bookName;
    String authorName;
    int id;
    int serialNumber;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\"BookName [BookName "+ bookName + ", AuthorName = " + authorName + ", Id = " + id + ", SerialNumber = " + serialNumber + "]";
    }
}
