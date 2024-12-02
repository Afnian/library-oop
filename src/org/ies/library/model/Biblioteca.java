package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {

    private String name;
    private Book[] books;

    public Biblioteca(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Book findBook(String isbn) {
        for (var book: books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public int countBooks(String nif){
        int count = 0;
        for (Book book: books) {
            if (book.hasAuthor(nif)) {
                count++;
            }
        }
        return count;
    }

    public boolean hasBook(String ISBN) {
        for (var book: books)
            if (book.getISBN().equals(ISBN)) {
                return true;
            }
        return false;
    }

    public boolean hasAuthor(String NIF){
        for (var author: Book.getAuthors())
    }

    public int countAuthorBooks(String authorNif) {
        int count = 0;
        for (var book: books) {
            if (book.hasAuthor(authorNif)) {
                count++;
            }
        }
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBook(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(books));
    }
}
