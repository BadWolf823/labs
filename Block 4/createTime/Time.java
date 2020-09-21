/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createTime;

/**
 *
 * @author muravyovas
 */
public class Time {

    int time;

    Time(int time) {
        this.time = time;
    }
    Time(int hour, int min, int sec){
        this.time = hour * 3600 + min * 60 + sec;
    }
    public String toString() {
        return (this.time / 3600) % 24
                + ":"
                + this.time / 60 % 60
                + ":"
                + this.time % 60 % 60;
    }
}
