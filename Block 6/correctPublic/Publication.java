/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctPublic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Publication {

    private String name;
    private String text;
    private String tag;
    int rating;
    private List<Comment> comments = new ArrayList<>();

    public Publication(String name, String text, String tag, int rating) {
        this.name = name;
        this.text = text;
        this.tag = tag;
        this.rating = rating;
    }
    

    public String getName() {
        return name;
    }

    public void addRating() {
        rating++;
    }

    public void reduceRating() {
        rating--;
    }

    public void setText(String text) {
        if ((comments.size() == 0) && (rating == 0)) {
            this.text = text;
        } else {
            System.out.println("Text can't edit");
        }
    }

    public boolean isEditable() {
        if ((rating == 0) && (comments.size() == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String resStr = "("
                + this.rating
                + ") "
                + this.name
                + "\n тэги: "
                + this.tag
                + "\n"
                + this.text
                + "\nКоментарии:\n";
        for (int i = 0; i < comments.size(); i++) {
            resStr += comments.get(i).toString() + '\n';
        }
        return resStr;
    }

    public void setComment(Comment comment) {
        comments.add(comment);
    }
}
