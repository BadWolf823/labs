/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.music.block6;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Music {
    String author;
    String name;
    private Album album;

    public Music(String author, String name, Album album) {
        this.author = author;
        this.name = name;
        this.setAlbum(album);
    }

    public Music(String name, Album album) {
        this(null,name,album);
    }

    public Music(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Music(String name) {
        this(null, name);
    }

    public Album getAlbum() {
        return album;
    } 

    public void setAlbum(Album album) {
        album.addMusic(this);
        this.album = album;
    }

    @Override
    public String toString() {
        String res = this.name + 
                ", авторы: " + 
                ((this.album != null)?this.album.author:"") + 
                ((this.author != null)?(", " + this.author):"");
        return res;
    }
    
    public String getOtherMusicInAlbum(){
        String res = "";
        Music[] songs = this.album.getSongs();
        for (Music song : songs){res += song.toString() + "\n";}
        return res;
    }
}
