package org.ies.library.model;

import java.util.Arrays;

public class book {



    private String ISBN;
    private String title;
    private int year;
    private autor[] authors;

    public book(String ISBN, String title, int year, autor[] authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.authors = authors;
    }

    public boolean hasAuthor(String nif) {
        for (var author: authors)
        if (author.getNIF().equals(nif)) {
            return true;
        }
        return false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public autor[] getAuthors() {
        return authors;
    }

    public void setAuthors(autor[] authors) {
        this.authors = authors;
    }
}
