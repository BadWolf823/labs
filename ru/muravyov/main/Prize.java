package ru.muravyov.main;

public class Prize {
    private static final Prize[] prizes = new Prize[]{
            new Prize("Автомобиль"),
            new Prize(null),
            new Prize("Квартира")
    };

    private final String text;

    private Prize(String text){this.text = text;}

    public static Prize getPrizeFromList(int index){
        return prizes[index];
    }

    public static Prize getRandomPrize(){
        return prizes[(int) (Math.random() * prizes.length)];
    }

    @Override
    public String toString() {
        return text;
    }
}
