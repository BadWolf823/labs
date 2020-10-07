/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdShop;

/**
 *
 * @author badwolf
 */
public class Labs {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Sparrow(), new Parrot("hello"), new Сuckoo()};
        songs(birds);
    }
    
    static public void songs(Bird[] birds){
        for (Bird bird : birds) bird.song();
    }
}
