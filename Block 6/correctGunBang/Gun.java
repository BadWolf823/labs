/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctGunBang;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Gun {

    private int ammo;
    private final int maxAmmo;

    Gun(int ammo, int maxAmmo) {
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    Gun(int maxAmmo) {
        this(0, maxAmmo);
    }

    public int load(int ammo) throws Exception {
        if (ammo < 0) {
            throw new Exception("Negative number of ammo");
        }
        int overAmmo = 0;
        if (this.ammo + ammo > maxAmmo) {
            overAmmo = ammo - (maxAmmo - this.ammo);
            this.ammo = maxAmmo;
        } else {
            this.ammo = ammo;
        }
        return overAmmo;
    }

    public int clean() {
        int overAmmo = this.ammo;
        this.ammo = 0;
        return overAmmo;
    }

    public void attack() {
        if (this.ammo > 0) {
            System.out.println("Бах");
            this.ammo--;
        } else {
            System.out.println("Клац");
        }
    }
    
    public void attack(int n) {
        for (int i = 0; i < n; i++){
            this.attack();
        }
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int getAmmo() {
        return ammo;
    }

    public boolean isReady() {
        return (this.ammo > 0);
    }

}
