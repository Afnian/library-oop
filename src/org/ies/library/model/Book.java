package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {



    private String ISBN;
    private String title;
    private int year;
    private Autor[] authors;

    public Book(String ISBN, String title, int year, Autor[] authors) {
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

    public Autor[] getAuthors() {
        return authors;
    }

    public void setAuthors(Autor[] authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(ISBN, book.ISBN) && Objects.equals(title, book.title) && Objects.deepEquals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, year, Arrays.hashCode(authors));
    }
}
