/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctSquare;

/**
 *
 * @author muravyovas
 */
public class Point {
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "{"+this.x+";"+this.y+"}";
    }
}
