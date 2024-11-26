package org.ies.library.model;

import java.util.Scanner;

public class autor {
    private String NIF;
    private String name;
    private String surname;

    public autor(String NIF, String name, String surname) {
        this.NIF = NIF;
        this.name = name;
        this.surname = surname;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}