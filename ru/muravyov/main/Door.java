package ru.muravyov.main;

abstract public class Door {
    Prize[] prizes = new Prize[]{Prize.AUTO, Prize.CERTIFICATE, Prize.EMPTY, Prize.FlAT};
    public static final Door ONE = new Door() {
        @Override
        public Prize open() {
            return Prize.AUTO;
        }
    };

    public static final Door TWO = new Door(){
        @Override
        public Prize open() {
            return Prize.EMPTY;
        }
    };
    public static final Door THREE = new Door(){
        @Override
        public Prize open() {
            return prizes[(int) (Math.random() * prizes.length)];
        }
    };

    private Door(){}

    public abstract Prize open();
}
