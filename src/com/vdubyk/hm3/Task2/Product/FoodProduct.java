package com.vdubyk.hm3.Task2.Product;

import com.vdubyk.hm3.Task2.Customer.AgeRestriction;
import com.vdubyk.hm3.Task2.Interface.Expiriable;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class FoodProduct extends Product implements Expiriable,Comparable<FoodProduct>{

    private LocalDate ExpirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, LocalDate expirationDate) {
        super(name, price, quantity, ageRestriction);
        ExpirationDate = expirationDate;
    }


    @Override
    public double getPrice() {
        if (getExpirationDate().toEpochDay() - LocalDate.now().toEpochDay() <= 15) {
            return super.getPrice() * 0.7;
        }
        return super.getPrice();
    }


    @Override
    public LocalDate getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        ExpirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + super.getQuantity() +
                ", ageRestriction=" + super.getAgeRestriction() +
                ", ExpirationDate=" + getExpirationDate() +
                '}';
    }


        @Override
        public int compareTo(FoodProduct o) {
            return (int)this.getExpirationDate().toEpochSecond(LocalTime.MIDNIGHT, ZoneOffset.UTC)-(int)o.getExpirationDate().toEpochSecond(LocalTime.MIDNIGHT, ZoneOffset.UTC);
        }
}
