package org.ies.library.model;

import java.util.Arrays;

public class book {



    private String ISBN;
    private String title;
    private int year;
    private String author[] authors;

    public book(String ISBN, String title, int year, String[] author) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.author = author;
    }


}
