package org.ies.library.model;

import java.util.Arrays;

public class biblioteca {

    private String name;
    private book[] books;

    public biblioteca(String name, book[] books) {
        this.name = name;
        this.books = books;
    }

    public boolean hasBook(String ISBN) {
        for (var book: books)
            if (book.getISBN().equals(ISBN)) {
                return true;
            }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public book[] getBooks() {
        return books;
    }

    public void setBook(book[] books) {
        this.books = books;
    }
}
