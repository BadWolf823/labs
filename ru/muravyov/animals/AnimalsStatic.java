package ru.muravyov.animals;

import ru.muravyov.animals.Bird;
import ru.muravyov.animals.Meowable;

import java.util.List;

public class AnimalsStatic {
    public static void meow(List<Meowable> meowables){
        for (Meowable animal : meowables){
            animal.meow();
        }
    }
    static public void songs(Bird[] birds){
        for (Bird bird : birds) bird.song();
    }

}
