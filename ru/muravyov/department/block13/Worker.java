/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.department.block13;

/**
 * @author muravyovas
 */
public class Worker {
    public String name;
    Departament departament;

    public Worker(Departament departament, String name) {
        this.name = name;
        this.departament = departament;
        if (this.departament.getChief() == null) this.departament.setChief(this);
        departament.workerList.add(this);
    }

    public void setDepartament(Departament departament) {
        if (this.departament != null) {
            this.departament.workerList.remove(this);
            if (this.departament.chief == this) this.departament.chief = null;
        }
        this.departament = departament;
        if (departament.chief == null) departament.chief = this;
        departament.workerList.add(this);
    }

    public String toString() {
        return this.name + " работает в " + this.departament.name + ", начальник которого " + this.departament.getChief().name;
    }

}
