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
public class MachineGun extends Gun{
    private final int speed;

    public MachineGun(int speed, int maxAmmo) {
        super(maxAmmo);
        if (speed <= 0) throw new IllegalArgumentException("SPEED <= 0");
        this.speed = speed;
    }
    public MachineGun(int maxAmmo){
        this(maxAmmo/2, maxAmmo);
    }
    public MachineGun(){
        this(30,30);
    }

    @Override
    public void shoot() {
        for (int i = 0; i < speed; i++) super.shoot();
    }
    
}
