package ru.muravyov.publication.block1;

public class Comment {
    public String text;
    public int rating;
    public Comment(String text, int rating){
        this.text = text;
        this.rating = rating;
    }
    public String toString(){
        return "(" + rating + ") " + text;
    }
}
