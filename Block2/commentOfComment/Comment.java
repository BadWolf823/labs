/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commentOfComment;

/**
 *
 * @author muravyovas
 */
public class Comment {
    Comment answerComment;
    String text;
    int rating;
    Comment(String text, int rating){
        this.text = text;
        this.rating = rating;
    }
    public String toString(){
        Comment tmpComment = this;
        String resStr = tmpComment.text + "\n";
        int count = 0;
        while (tmpComment.answerComment != null){
            count++;
            tmpComment = tmpComment.answerComment;
            for (int i = 0; i < count; i++){
                resStr += "---";
            }
            resStr += tmpComment.text + "\n";
        }
        return resStr;
    }
    public void setAnswerComment(Comment comment){
        this.answerComment = comment;
    }
}
