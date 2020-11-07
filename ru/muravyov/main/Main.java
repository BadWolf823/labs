package ru.muravyov.main;

public class Main{
    public static void main(String[] args) {
        NameBuildable nameBuildable = Name.getBuilder()
                .setFirstName("Иван")
                .setPatronymic("Иванович");
        Name name = nameBuildable.getName();
        nameBuildable = Name.getBuilder();
        Name name1 = nameBuildable.getName();
        System.out.println(name);
        System.out.println(name1);
    }
}

class Name{
    private String firstName, secondName, patronymic;

    private static final NameBuilder nameBuilder = new NameBuilder();

    private Name(String secondName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s %s",
                (secondName!=null)?secondName:"",
                (firstName != null)?firstName:"",
                (patronymic != null)?patronymic:""
                );
    }

    public static NameBuildable getBuilder(){
        return nameBuilder;
    }

    private static class NameBuilder implements NameBuildable{
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
            return new Name(secondName, firstName, patronymic);
        }
    }
}

interface NameBuildable{
    NameBuildable setFirstName(String firstName);
    NameBuildable setSecondName(String secondName);
    NameBuildable setPatronymic(String patronymic);
    Name getName();
}