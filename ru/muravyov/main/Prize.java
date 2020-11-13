package ru.muravyov.main;

public class Prize {

    public static final Prize AUTO = new Prize("Автомобиль");
    public static final Prize EMPTY = new Prize(null);
    public static final Prize FlAT = new Prize("Квартира");
    public static final Prize CERTIFICATE = new Prize("Сертификат");

    private static final Prize[] prizes = new Prize[]{
            AUTO,
            EMPTY,
            FlAT,
            CERTIFICATE
    };

    private final String text;

    private Prize(String text){this.text = text;}

    public static Prize getRandomPrize(){
        return prizes[(int) (Math.random() * prizes.length)];
    }

    @Override
    public String toString() {
        return text;
    }
}
