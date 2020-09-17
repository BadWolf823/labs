/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicAndLink;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Music {
    String author;
    String name;
    Album album;
    public Music(String name, Album album, String author) {
        this.author = author;
        this.name = name;
        this.album = album;
    }
    public Music(String name, String author) {
        this.author = author;
        this.name = name;
    }
    public void setAlbum(Album album){
        this.album = album;
        this.album.addMusic(this);
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
        Music[] songs = this.album.songs.toArray(new Music[this.album.songs.size()]);
        for (Music song : songs){res += song.toString() + "\n";}
        return res;
    }
}
