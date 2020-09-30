/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сorrectDepatment;

/**
 *
 * @author muravyovas
 */
public class Departament {
    String name;
    private Worker chief;
    Departament(String name){
        this.name = name;
    }
    public void setChief(Worker chief){
        if (chief.departament == this) this.chief = chief;
    }

    public Worker getChief() {
        return chief;
    }
}
