/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctGunBang;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) throws Exception {
        Gun gun = new Gun(7);
        gun.load(3);
        gun.attack(5);
        gun.load(8);
        gun.attack(2);
        gun.clean();
        gun.attack();
        
    }
}
