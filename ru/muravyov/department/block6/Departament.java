/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.department.block6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Departament {
    String name;
    private Worker chief;
    private List<Worker> workerList = new ArrayList<>();
    public Departament(String name){
        this.name = name;
    }

    public void setChief(Worker chief){
        if (chief.getDepartament() == this){
            this.chief = chief;
        }
    }

    public void addWorker(Worker worker){
        if (!workerList.contains(worker)){
            if (worker.getDepartament() != null){
                worker.getDepartament().workerList.remove(worker);
                if (worker.getDepartament().chief == worker) worker.getDepartament().chief = null;
            }
            if (this.chief == null) this.chief = worker;
            workerList.add(worker);
            worker.setDepartament(this);
        }
    }

    public Worker getChief() {
        return chief;
    }
    public Worker[] getWorkers(){
        return workerList.toArray(new Worker[0]);
    }
}
