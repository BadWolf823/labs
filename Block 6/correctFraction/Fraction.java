/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctFraction;

/**
 *
 * @author muravyovas
 */
public class Fraction {
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
}
