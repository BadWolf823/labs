/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.music.block13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Album {

    public String name;
    public String author;
    List<Music> songs = new ArrayList<>();

    Album(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void addMusic(Music music) {
        if (music.getAlbum() != null) {
            music.album.songs.remove(music);
        }
        this.songs.add(music);
        music.album = this;
    }

    public Music[] getSongs() {
        return songs.toArray(new Music[this.songs.size()]);
    }

}
