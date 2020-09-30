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
public class Labs {
    public static void main(String[] args) {
        Departament departament = new Departament("IT");
        Departament d1 = new Departament("JK");
        Worker petrov = new Worker(departament,"Петров");
        Worker kozlov = new Worker(departament,"Козлов");
        Worker sidorov = new Worker(d1, "Сидоров");
        departament.setChief(kozlov);
        departament.setChief(sidorov);
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }
    
}
