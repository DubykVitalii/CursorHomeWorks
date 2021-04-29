package com.vdubyk.hm2;

import java.util.Objects;

public class Money {
    private long hryvnya;
    private byte kopick;

    public Money(long hryvnya, byte kopick) {
        this.hryvnya = hryvnya;
        this.kopick = kopick;
    }

    public Money additation(Money money) {
        byte resultKopiyka = (byte) (this.kopick + money.kopick);
        long resultHryvnya = this.hryvnya + money.hryvnya;
        if (resultKopiyka >= 100) {
            resultHryvnya++;
            resultKopiyka = (byte) (resultKopiyka - 100);
        }
        return new Money(resultHryvnya, resultKopiyka);
    }

    public Money substraction(Money money) {
        byte resultKopiyka = (byte) (this.kopick - money.kopick);
        long resultHryvnya = this.hryvnya - money.hryvnya;
        if (resultKopiyka < 0) {
            resultHryvnya--;
            resultKopiyka = (byte) (100 + resultKopiyka);
        }
        return new Money(resultHryvnya, resultKopiyka);
    }

    public Money multiplication(double numberMultiplication) {
        long allkopick = (long) (allKopick() * numberMultiplication);
        return convertMoney(allkopick);
    }

    public Money division(double numberDivision) {
        long allkopick = (long) (allKopick() / numberDivision);
        return convertMoney(allkopick);
    }

    public double allKopick() {
        return this.hryvnya * 100 + this.kopick;
    }

    public Money convertMoney(long allkopick) {
        return new Money((long) (allkopick / 100), (byte) (allkopick % 100));
    }


    public boolean isHighMoney(Money money) {
        return allKopick() > money.allKopick();
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return allKopick() == money.allKopick();
    }

    @Override
    public String toString() {
        return (kopick < 10) ? ( hryvnya + ".0" + kopick) : (hryvnya + "," + kopick);
    }
}
