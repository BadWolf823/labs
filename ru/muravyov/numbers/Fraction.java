/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.numbers;

public final class Fraction<T extends Number> extends Number {
    final double numerator;
    final double denominator;

    public Fraction(T numerator, T denominator) throws ArithmeticException {
        if (denominator.intValue() <= 0) throw new ArithmeticException();
        this.numerator = numerator.doubleValue();
        this.denominator = denominator.doubleValue();
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction<Double> sum(Fraction<?> f) {
        if (this.denominator != f.denominator) {
            return new Fraction<>(this.numerator * f.denominator + f.numerator * this.denominator, this.denominator * f.denominator);
        }
        return new Fraction<>(this.numerator + f.numerator, f.denominator);
    }

    public Fraction<Double> sum(int x) {
        return this.sum(new Fraction<>(x, 1));
    }

    public Fraction<Double> minus(Fraction<?> f) {
        if (this.denominator != f.denominator) {
            return new Fraction<>(this.numerator * f.denominator - f.numerator * this.denominator, this.denominator * f.denominator);
        }
        return new Fraction<>(this.numerator - f.numerator, f.denominator);
    }

    public Fraction<Double> minus(int x) {
        return this.minus(new Fraction<>(x, 1));
    }

    public Fraction<Double> div(Fraction<?> f) {
        return new Fraction<>(this.numerator * f.denominator, this.denominator * f.numerator);
    }

    public Fraction<Double> div(int x) {
        return this.div(new Fraction<>(x, 1));
    }

    public Fraction<Double> multiplication(Fraction<?> f) {
        return new Fraction<>(this.numerator * f.numerator, this.denominator * f.denominator);
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
        return (long) (this.numerator / this.denominator);
    }

    @Override
    public float floatValue() {
        return (float) (this.numerator / this.denominator);
    }

    @Override
    public double doubleValue() {
        return this.numerator / this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o.getClass() != Fraction.class) return false;
        Fraction<?> fraction = (Fraction<?>) o;
        return
                (Double.compare(fraction.denominator, denominator) == 0) &&
                        (Double.compare(fraction.numerator, numerator) == 0);
    }

    @Override
    public int hashCode() {
        return (int) (denominator + numerator);
    }
}
