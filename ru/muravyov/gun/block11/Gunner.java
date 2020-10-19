/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.gun.block11;

import ru.muravyov.gun.block10.Weapon;

/**
 *
 * @author badwolf
 */
public class Gunner {
    private String name;
    private Weapon weapon;

    public Gunner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void shoot(){
        if (weapon == null) System.out.println("Не могу участвовать в перестрелке");
        else weapon.shoot();
    }
    
}
