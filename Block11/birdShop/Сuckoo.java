/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdShop;

/**
 *
 * @author badwolf
 */
public class Сuckoo extends Bird{

    @Override
    void song() {
        int count = (int)(Math.random() * 10) + 1;
        for (int i = 0; i < count; i++){
            System.out.println("ку-ку");
        }
    }
    
}
