package ru.muravyov.game;

abstract public class WarUnitDecorator implements WarUnit{
    protected WarUnit unit;
    public WarUnitDecorator(WarUnit unit){
        this.unit = unit;
    }

    @Override
    public WarUnit clone() {
        WarUnitDecorator newWarUnit;
        try {
            newWarUnit = (WarUnitDecorator) super.clone();
            newWarUnit.unit = unit.clone();
        } catch (CloneNotSupportedException e) {
            newWarUnit = null;
        }
        return newWarUnit;
    }
}
