/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.publication.block6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Comment {
    private final List<Comment> answerComments = new ArrayList<>();
    int level = 0;
    private String text;
    private int rating;
    Comment(String text, int rating){
        this.text = text;
        this.rating = rating;
    }

    public void setText(String text) {
        if ((rating == 0)&&(answerComments.size() == 0)) this.text = text;
        else System.out.println("This comment can't edit");
    }
    public boolean isEditable() {
        if ((rating == 0) && (answerComments.size() == 0)) {
            return true;
        }
        return false;
    }
    
    public void addRating() {
        rating++;
    }

    public void reduceRating() {
        rating--;
    }
    
    @Override
    public String toString(){
        String resStr = "";
        for (int i = 0; i < this.level; i++) resStr += "---";
        if (this.answerComments.size() == 0) return resStr + "(" + this.rating + ") " +this.text;
        resStr += "(" + this.rating + ") " + this.text;
        for (int i = 0; i < this.answerComments.size(); i++){
            resStr +='\n' + this.answerComments.get(i).toString();
        }
        return resStr;
                
    }
    public void setAnswerComment(Comment comment){
        comment.level = this.level + 1;
        this.answerComments.add(comment);
    }
}
