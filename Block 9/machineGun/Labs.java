/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machineGun;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) throws Exception {
        MachineGun machineGun = new MachineGun(1, 100);
        machineGun.load(100);
        machineGun.attack();
        
    }
}
