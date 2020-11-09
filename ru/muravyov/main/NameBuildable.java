package ru.muravyov.main;

interface NameBuildable {
    NameBuildable setFirstName(String firstName);

    NameBuildable setSecondName(String secondName);

    NameBuildable setPatronymic(String patronymic);

    Name getName();
}
