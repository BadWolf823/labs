/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdShop;

import java.util.Arrays;

/**
 *
 * @author badwolf
 */
public class Parrot extends Bird{
    String text;

    public Parrot(String text) {
        this.text = text;
    }
    
    @Override
    void song() {
        char[] text = this.text.toCharArray();
        for (int i = 0; i < text.length; i++){
            int select = (int)(Math.random() * text.length);
            char tmp = text[i];
            text[i] = text[select];
            text[select] = tmp;
        }
        String res = "";
        for (int i = 0; i < text.length; i++) res += text[i];
        System.out.println(res);
    }
    
}
