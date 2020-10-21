/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.department.block6;

/**
 *
 * @author muravyovas
 */
public class Worker {
    private Departament departament;
    public String name;
    public Worker(Departament departament,String name){
        this.name = name;
        this.departament = departament;
        if (departament.getChief()==null) this.departament.setChief(this);
        departament.addWorker(this);
    }

    public void setDepartament(Departament departament) {
        departament.addWorker(this);
        this.departament = departament;
    }

    public Departament getDepartament(){
        return departament;
    }

    public String toString(){
        return this.name + " работает в " + this.departament.name + ", начальник которого " + this.departament.getChief().name;
    }
    
}
