/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.gun.block10;

/**
 *
 * @author badwolf
 */
public class Gun extends Weapon{
    private final int maxAmmo;
    public Gun(int ammo, int maxAmmo) {
        super(ammo);
        if (maxAmmo <= 0) throw new IllegalArgumentException();
        this.maxAmmo = maxAmmo;
    }

    public Gun(int maxAmmo) {
        this(0, maxAmmo);
    }
    
    public Gun(){
        this(0,30);
    }
    
    
    @Override
    public void shoot() {
        if (this.getAmmo()) {
            System.out.println("Бах");
        } else {
            System.out.println("Клац");
        }
    }
    
}
