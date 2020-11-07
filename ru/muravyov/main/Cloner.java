package ru.muravyov.main;

public class Cloner {
    public static PublicCloneable[] clone(PublicCloneable ... obj){
        PublicCloneable[] objects = new PublicCloneable[obj.length];
        for(int i = 0; i < objects.length; i++){
            objects[i] = clone(obj[i]);
        }
        return objects;
    }
    public static PublicCloneable clone(PublicCloneable obj){
        return (PublicCloneable) obj.clone();
    }
}
