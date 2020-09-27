/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctAlbum;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        Album kuklovod = new Album("Кукловод","Металлов");
        Album highway = new Album("Шоссе к ООП","Асид");
        Music music1 = new Music("Состаяние объектов",kuklovod,"Янг");
        Music music2 = new Music("Шоссе к ООП", null);
        Music music3 = new Music("Одноразовый программист", "Бертон");
        music2.setAlbum(highway);
        music3.setAlbum(kuklovod);
        music1.setAlbum(highway);
        System.out.println(music1.getOtherMusicInAlbum());
    }
}
