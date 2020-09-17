/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block1.time;

/**
 *
 * @author muravyovas
 */
public class Time {

    int time;

    Time(int time) {
        this.time = time;
    }

    public String toString() {
        return (this.time / 3600) % 24
                + ":"
                + this.time / 60 % 60
                + ":"
                + this.time % 60 % 60;
    }
}
