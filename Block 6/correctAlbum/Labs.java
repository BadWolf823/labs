/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctAlbum;

import pack.Music;
import pack.Album;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        Album kuklovod = new Album("Кукловод","Металлов");
        Album highway = new Album("Шоссе к ООП","Асид");
        Music music1 = new Music("Состаяние объектов","Янг");
        Music music3 = new Music("Одноразовый программист", "Бертон");
        music1.setAlbum(highway);
        music3.setAlbum(highway);
        Album test = music3.getAlbum();
        test = kuklovod;
        System.out.println(music1.getOtherMusicInAlbum());
    }
}