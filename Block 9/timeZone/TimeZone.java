/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeZone;

/**
 * 
 * @author badwolf
 */
public class TimeZone implements Cloneable{

    private int utcHour;
    private int utcMin;

    public TimeZone(int utcHour, int utcMin) {
        if ((utcMin % 30 == 0)&&(utcHour * 60 + utcMin <= 840)&&(utcHour * 60 - utcMin >= -720)){
            this.utcMin = utcMin;
            this.utcHour = utcHour;
        } else throw new IllegalArgumentException("Unsupported UTC");
    }

    public TimeZone(TimeZone timeZone) {
        this.utcHour = timeZone.utcHour;
        this.utcMin = timeZone.utcMin;
    }
    
    @Override
    public String toString() {
        return "("+
                ((utcHour < 0)?"-":"+")+
                Math.abs(utcHour)/10 +
                Math.abs(utcHour)%10 +
                ":" +
                Math.abs(utcMin)/10 +
                Math.abs(utcMin)%10 +
                " UTC)";
    }
    
    
}
