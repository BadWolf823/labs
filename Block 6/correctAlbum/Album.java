/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctAlbum;

import java.util.ArrayList;

/**
 *
 * @author muravyovas
 */
public class Album {
    String name;
    String author;
    private ArrayList<Music> songs = new ArrayList<>();

    public Music[] getSongs() {
        return songs.toArray(new Music[songs.size()]);
    }
    
    Album(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void addMusic(Music music){
        if (music.isEmptyAlbum()) songs.add(music);
    }
}
