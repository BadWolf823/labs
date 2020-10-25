/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.department.block13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Departament {
    public String name;
    Worker chief;
    List<Worker> workerList = new ArrayList<>();
    public Departament(String name){
        this.name = name;
    }

    public void setChief(Worker chief){
        this.chief = chief;
        chief.departament = this;
    }

    public void addWorker(Worker worker){
        if (worker.departament != null) {
            worker.departament.workerList.remove(worker);
            if (worker.departament.chief == worker) worker.departament.chief = null;
        }
        workerList.add(worker);
        worker.departament = this;
        if (this.chief == null) this.chief = worker;
    }

    public Worker getChief() {
        return chief;
    }

    public Worker[] getWorkers(){
        return workerList.toArray(new Worker[0]);
    }
}
