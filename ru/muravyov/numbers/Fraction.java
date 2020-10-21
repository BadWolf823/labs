/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.numbers;

/**
 *
 * @author muravyovas
 */
public final class Fraction extends Number{
    final int numerator;
    final int denominator;

    public Fraction(int numerator, int denominator) throws ArithmeticException{
        this.numerator = numerator;
        if (denominator <= 0) throw new ArithmeticException();
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
    public Fraction sum(Fraction f){
        if (this.denominator != f.denominator){
            return new Fraction(this.numerator * f.denominator + f.numerator * this.denominator,this.denominator * f.denominator);
        }
        return new Fraction(this.numerator + f.numerator, f.denominator);
    }
    public Fraction sum(int x){return this.sum(new Fraction(x,1));}
    public Fraction minus(Fraction f){
        if (this.denominator != f.denominator){
            return new Fraction(this.numerator * f.denominator - f.numerator * this.denominator,this.denominator * f.denominator);
        }
        return new Fraction(this.numerator - f.numerator, f.denominator);
    }
    public Fraction minus(int x){return this.minus(new Fraction(x, 1));}
    public Fraction div(Fraction f){
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }
    public Fraction div(int x){return this.div(new Fraction(x, 1));}
    public Fraction multiplication(Fraction f){
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }
    public Fraction multiplication(int x){
        return this.multiplication(new Fraction(x, 1));
    }

    @Override
    public int intValue() {
        return (int)(this.longValue());
    }

    @Override
    public long longValue() {
        return (long)this.numerator / this.denominator;
    }

    @Override
    public float floatValue() {
        return (float)this.numerator / this.denominator;
    }

    @Override
    public double doubleValue() {
        return (double)this.numerator / this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o.getClass() != Fraction.class) return false;
        Fraction fraction = (Fraction)o;
        return (fraction.denominator == this.denominator)&&(fraction.numerator == this.numerator);
    }

    @Override
    public int hashCode() {
        return denominator + numerator;
    }
}
