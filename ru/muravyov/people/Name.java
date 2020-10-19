/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.people;

/**
 *
 * @author muravyovas
 */
public class Name {

    private String surname;
    private String name;
    private String patronymic;

    Name(String name) {
        this(name, null);
    }

    Name(String name, String surname) {
        this(name, null, surname);
    }

    Name(String name, String patronymic, String surname) {
        if ((name == null) || (name.equals(""))) {
            throw new IllegalArgumentException("Empty name");
        }
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String toString() {
        String fullName = "";
        if (this.surname != null) {
            fullName += this.surname + " ";
        }
        if (this.name != null) {
            fullName += this.name + " ";
        }
        if (this.patronymic != null) {
            fullName += this.patronymic;
        }
        return fullName;
    }

    public void setSurname(String surname) {
        if ((surname == null) || (surname.equals(""))) {
            throw new NullPointerException();
        }
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        if ((patronymic == null) || (patronymic.equals(""))) {
            throw new NullPointerException();
        }
        this.patronymic = patronymic;
    }

    public void setName(String name) {
        if ((name == null) || (name.equals(""))) {
            throw new NullPointerException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }
    
}
