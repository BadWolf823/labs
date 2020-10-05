/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeZone;

/**
 *
 * @author muravyovas
 */
public class Time {

    private int time;

    Time(int time) {
        if (time >= 86400){
            this.time = (((time / 3600)%24)*3600) + time % 3600;
        } else {
            this.time = time;
        }
    }

    Time(int hour, int min, int sec) {
        if (hour >=24){
            this.time = (hour % 24) * 3600 + min * 60 + sec;
        } else {
            this.time = hour * 3600 + min * 60 + sec;
        }
    }

    public String toString() {
        return (this.time / 3600)
                + ":"
                + this.time / 60 % 60
                + ":"
                + this.time % 60 % 60;
    }

    public int getHour() {
        return (this.time / 3600);
    }
    public int getMinute(){
        return (this.time/60) % 60;
    }
    public int getSec(){
        return (this.time % 60 % 60);
    }
}
