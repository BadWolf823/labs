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
public class Labs {
    public static void main(String[] args) {
        Departament departament = new Departament("IT");
        Worker petrov = new Worker(departament,"Петров");
        Worker kozlov = new Worker(departament,"Козлов");
        Worker sidorov = new Worker(departament, "Сидоров");
        departament.setChief(kozlov);
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }
    
}
