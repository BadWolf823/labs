/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Publication {
    String name;
    String text;
    String tag;
    int rating;
    List<Comment> comments = new ArrayList<>(); 

    public Publication(String name, String text, String tag, int rating) {
        this.name = name;
        this.text = text;
        this.tag = tag;
        this.rating = rating;
    }
    
    
    @Override
    public String toString() {
        String resStr = "(" +
                this.rating + 
                ") " + 
                this.name +
                "\n тэги: " +
                this.tag +
                "\n" + 
                this.text + 
                "\nКоментарии:\n";
        for (int i = 0; i < comments.size(); i++){
            resStr += comments.get(i).toString() + '\n';
        }
        return resStr;
    }
    public void setComment(Comment comment){
        comments.add(comment);
    }
}
