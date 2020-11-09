package ru.muravyov.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Name {
    private String firstName, secondName, patronymic;

    private static final NameBuilder nameBuilder = new NameBuilder();

    private static final List<Name> listName = new ArrayList<>();

    private Name(String secondName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return secondName +
                " " +
                firstName +
                " " +
                patronymic;
    }

    public static NameBuildable getBuilder() {
        return nameBuilder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) &&
                Objects.equals(secondName, name.secondName) &&
                Objects.equals(patronymic, name.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, patronymic);
    }

    private static class NameBuilder implements NameBuildable {
        private String firstName, secondName, patronymic;

        @Override
        public NameBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public NameBuilder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        @Override
        public NameBuilder setPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        @Override
        public Name getName() {
            Name name = new Name(secondName,firstName,patronymic);
            int i = listName.indexOf(name);
            if (i != -1) return listName.get(i);
            listName.add(name);
            return name;
        }
    }
}
