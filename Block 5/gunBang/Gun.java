/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gunBang;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Gun {
    int ammo;
    Gun(int ammo){
        this.ammo = ammo;
    }
    Gun(){
        this(5);
    }
    public void attack(){
        if(this.ammo > 0){
            System.out.println("Бах");
            this.ammo--;
        } else {
            System.out.println("Клац");
        }
    }
}
