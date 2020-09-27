/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctAlbum;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Music {
    String author;
    String name;
    private Album album;
    public Music(String name, Album album, String author) {
        this.author = author;
        this.name = name;
        this.setAlbum(album);
    }
    public Music(String name, String author) {
        this.author = author;
        this.name = name;
    }
    public void setAlbum(Album album){
        if (this.album == null){
            album.addMusic(this);
            this.album = album;
        }
    }
    
    public boolean isEmptyAlbum(){
        if (album == null) return true;
        return false;
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
