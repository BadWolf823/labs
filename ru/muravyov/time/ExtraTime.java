/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.time;

/**
 *
 * @author badwolf
 */
public class ExtraTime extends Time {
    TimeZone timeZone;

    public ExtraTime(int time, TimeZone timeZone) {
        super(time);
        this.timeZone = timeZone;
    }

    public ExtraTime(int hour, int min, int sec, TimeZone timeZone) {
        this(hour * 3600 + min * 60 + sec, timeZone);
    }

    @Override
    public String toString() {
        return 
                super.toString() +
                " " +
                timeZone.toString();
                
    }

    public TimeZone getUTC(){
        return new TimeZone(this.timeZone);
    } 
    
    
}
