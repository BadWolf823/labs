/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commentOfComment;

/**
 * Костыли))
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        Comment comment1 = new Comment("отличные задачи!",169);
        comment1.setAnswerComment(new Comment("совершенно согласен с этим комментарием!",5));
        comment1.answerComment.setAnswerComment(new Comment("что-то я ничего не понял",0));
        System.out.println(comment1);
    }
}
