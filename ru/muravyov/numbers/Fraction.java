/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.numbers;

public final class Fraction<T extends Number> extends Number implements Comparable<Fraction<?>>{
    private final T numeratorObj;
    public final double numeratorValue;
    private final T denominatorObj;
    public final double denominatorValue;

    public Fraction(T numerator, T denominator) throws ArithmeticException {
        if (denominator.intValue() <= 0) throw new ArithmeticException();
        this.numeratorObj = numerator;
        numeratorValue = numerator.doubleValue();
        this.denominatorObj = denominator;
        denominatorValue = denominator.doubleValue();
    }

    @Override
    public String toString() {
        return numeratorObj + "/" + denominatorObj;
    }

    public Fraction<Double> sum(Fraction<?> f) {
        if (this.denominatorValue != f.denominatorValue) {
            return new Fraction<>(
                    this.numeratorValue * f.denominatorValue + f.numeratorValue * this.denominatorValue,
                    this.denominatorValue * f.denominatorValue
            );
        }
        return new Fraction<>(this.numeratorValue + f.numeratorValue, f.denominatorValue);
    }

    public Fraction<Double> sum(int x) {
        return this.sum(new Fraction<>(x, 1));
    }

    public Fraction<Double> minus(Fraction<?> f) {
        if (this.denominatorValue != f.denominatorValue) {
            return new Fraction<>(
                    this.numeratorValue * f.denominatorValue - f.numeratorValue * this.denominatorValue,
                    this.denominatorValue * f.denominatorValue
            );
        }
        return new Fraction<>(this.numeratorValue - f.numeratorValue, f.denominatorValue);
    }

    public Fraction<Double> minus(int x) {
        return this.minus(new Fraction<>(x, 1));
    }

    public Fraction<Double> div(Fraction<?> f) {
        return new Fraction<>(
                this.numeratorValue * f.denominatorValue,
                this.denominatorValue * f.numeratorValue
        );
    }

    public Fraction<Double> div(int x) {
        return this.div(new Fraction<>(x, 1));
    }

    public Fraction<Double> multiplication(Fraction<?> f) {
        return new Fraction<>(
                this.numeratorValue * f.numeratorValue,
                this.denominatorValue * f.denominatorValue
        );
    }

    public Fraction<Double> multiplication(int x) {
        return this.multiplication(new Fraction<>(x, 1));
    }

    @Override
    public int intValue() {
        return (int) (this.longValue());
    }

    @Override
    public long longValue() {
        return (long) (this.numeratorValue / this.denominatorValue);
    }

    @Override
    public float floatValue() {
        return (float) (this.numeratorValue / this.denominatorValue);
    }

    @Override
    public double doubleValue() {
        return this.numeratorValue / this.denominatorValue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o.getClass() != Fraction.class) return false;
        Fraction<?> fraction = (Fraction<?>) o;
        return (Double.compare(fraction.denominatorValue, denominatorValue) == 0) &&
                        (Double.compare(fraction.numeratorValue, numeratorValue) == 0);
    }

    @Override
    public int hashCode() {
        return (int) (denominatorValue + numeratorValue);
    }

    @Override
    public int compareTo(Fraction<?> o) {
        if (this.doubleValue() > o.doubleValue()) return 1;
        if (this.doubleValue() < o.doubleValue()) return -1;
        return 0;
    }
}
