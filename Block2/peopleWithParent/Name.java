/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleWithParent;

/**
 *
 * @author muravyovas
 */
public class Name {

    String surname;
    String name;
    String patronymic;
    Name(String name){this.name = name;}
    Name(String name, String surname){
        this(name);
        this.surname = surname;
    }
    Name(String name, String patronymic, String surname){
        this(name,surname);
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
}
