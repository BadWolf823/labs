/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.gun.block11;

import ru.muravyov.gun.block10.Gun;
import ru.muravyov.gun.block10.MachineGun;

/**
 *
 * @author badwolf
 */
class Labs {
    public static void main(String[] args) {
        Gunner g1 = new Gunner("Петя");
        Gunner g2 = new Gunner("Вася");
        Gunner g3 = new Gunner("Том");
        
        Gun gun = new Gun(10);
        gun.load(1);
        
        MachineGun machineGun = new MachineGun(2,10);
        machineGun.load(1);
        
        g2.setWeapon(gun);
        g3.setWeapon(machineGun);
        
        g1.shoot();
        g2.shoot();
        g3.shoot();
    }
}
