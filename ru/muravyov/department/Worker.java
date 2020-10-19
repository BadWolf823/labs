/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.department;

/**
 *
 * @author muravyovas
 */
public class Worker {
    Departament departament;
    public String name;
    public Worker(Departament departament,String name){
        this.name = name;
        this.departament = departament;
        if (this.departament.getChief()==null) this.departament.setChief(this);
    }

    public String toString(){
        return this.name + " работает в " + this.departament.name + ", начальник которого " + this.departament.getChief().name;
    }
    
}
