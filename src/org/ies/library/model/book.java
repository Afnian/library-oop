package org.ies.library.model;

import java.util.Arrays;

public class book {



    private String ISBN;
    private String title;
    private int year;
    private String Author[] authors;

    public book(String ISBN, String title, int year, Author[] authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.authors = authors;
    }

    public boolean hasAuthor(String nif) {
        for (var author: authors)
        if (author.getNif().equals(nif)) {
            return true;
        }
        return true;
    }

    public String getISBN() {
        return ISBN;}
    public String getTitle() {
        return title;}
    public int getYear() {
        return year;}
}
