package com.vdubyk.hm2;

import java.util.Objects;

public class Fractions {

    private long numerator;
    private short denominator;

    public Fractions(long numerator, short denominator) {
        if (denominator == 0) {
            System.out.println("Can't be divided by zero");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fractions additation(Fractions fractions) {
        long resultNum = this.numerator * fractions.denominator + this.denominator * fractions.numerator;
        short resultDen = (short) (this.denominator * fractions.denominator);
        return new Fractions(resultNum, resultDen);

    }

    public Fractions substraction(Fractions fractions) {
        long resultNum = this.numerator * fractions.denominator - this.denominator * fractions.numerator;
        short resultDen = (short) (this.denominator * fractions.denominator);
        return new Fractions(resultNum, resultDen);
    }

    public Fractions multiplication(Fractions fractions) {
        long resultNum = this.numerator * fractions.numerator;
        short resultDen = (short) (this.denominator * fractions.denominator);
        return new Fractions(resultNum, resultDen);
    }

    public Fractions division(Fractions fractions) {
        long resultNum = this.numerator * fractions.denominator;
        short resultDen = (short) (this.denominator * fractions.numerator);
        return new Fractions(resultNum, resultDen);
    }





    public boolean isHighNumber(Fractions fractions) {
        return ((double) this.numerator / (double) this.denominator) > ((double) fractions.numerator / (double) fractions.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fractions fractions = (Fractions) o;
        return ((double) this.numerator / (double) this.denominator) > ((double) fractions.numerator / (double) fractions.denominator);
    }

    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }
}
