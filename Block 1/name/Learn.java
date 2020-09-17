/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block1.name;

/**
 *
 * @author muravyovas
 */
public class Learn {
    public static void main(String[] args){
        Name name1 = new Name("Клеопатра");
        
        Name name2 = new Name("Александр","Сергеевич","Пушкин");
        
        Name name3 = new Name("Владимир","Маяковский");
        
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());
    }
    
}
