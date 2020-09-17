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
public class Learn {
    public static void main(String[] args){
        Comment comment1 = new Comment("отличные задачи",169);
        Comment comment2 = new Comment("хорошые задачи", 100);
        Comment comment3 = new Comment("задачи",0);
        System.out.println(comment1.toString());
        System.out.println(comment2.toString());
        System.out.println(comment3.toString());
    }    
}
