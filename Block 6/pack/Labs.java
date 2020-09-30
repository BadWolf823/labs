/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        Album kuklovod = new Album("Кукловод","Металлов");
        Album highway = new Album("Шоссе к ООП","Асид");
        Music music1 = new Music("Состаяние объектов","Янг");
        Music music3 = new Music("Одноразовый программист", "Бертон",kuklovod);
        Music music2 = new Music("QQQ", "Fu");
        music1.setAlbum(highway);
        music3.setAlbum(kuklovod);
        music2.setAlbum(highway);
        kuklovod.addMusic(music2);
        System.out.println(music2.getOtherMusicInAlbum());
    }
}
