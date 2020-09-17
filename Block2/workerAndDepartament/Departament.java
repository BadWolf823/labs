/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workerAndDepartament;

/**
 *
 * @author muravyovas
 */
public class Departament {
    String name;
    Worker chief;
    Departament(String name){
        this.name = name;
    }
    public void setChief(Worker chief){
        this.chief = chief;
    }
}
