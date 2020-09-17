/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block1.comment;

/**
 *
 * @author muravyovas
 */
public class Comment {
    String text;
    int rating;
    Comment(String text, int rating){
        this.text = text;
        this.rating = rating;
    }
    public String toString(){
        return "(" + rating + ") " + text;
    }
}
