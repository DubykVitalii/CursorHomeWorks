package com.vdubyk.hm3.Task2.Product.ElectronicProduct;

import com.vdubyk.hm3.Task2.Customer.AgeRestriction;
import com.vdubyk.hm3.Task2.Product.ElectonicsProduct;

public class Computer extends ElectonicsProduct {

    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        setGuaranteedPeriod(24);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                ", guaranteedPeriod=" + super.getGuaranteedPeriod() +
                '}';
    }

}
