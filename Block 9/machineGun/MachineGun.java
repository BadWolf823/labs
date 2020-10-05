/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machineGun;

/**
 *
 * @author badwolf
 */
public class MachineGun extends Gun{
    private final int speed;

    public MachineGun(int speed, int maxAmmo) {
        super(maxAmmo);
        this.speed = speed;
    }
    
    public MachineGun(int maxAmmo) {
        this(maxAmmo / 2, maxAmmo);
    }

    public MachineGun() {
        this(30,30);
    }

    @Override
    public void attack() {
        for (int i = 0; i < speed; i++) super.attack();
    }

    @Override
    public void attack(int n) {
        for (int i = 0; i < n; i++) this.attack();
    }
    
    
    
    
    
}
