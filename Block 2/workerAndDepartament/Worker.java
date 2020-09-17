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
public class Worker {
    Departament departament;
    String name;
    Worker(Departament departament, String name){
        this.name = name;
        this.departament = departament;
    }

    public String toString(){
        return this.name + " работает в " + this.departament.name + ", начальник которого " + this.departament.chief.name;
    }
    
}
