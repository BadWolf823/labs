/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gunner;

/**
 *
 * @author badwolf
 */
abstract class Weapon {
    private int ammo;
    public Weapon(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }
    abstract void shoot();
    public int ammo() {return ammo;}
    
    public boolean getAmmo(){
        if (ammo == 0) return false;
        ammo--;
        return true;
    }
    public void load(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.ammo+=ammo;
    }
}
