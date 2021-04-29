package com.vdubyk.hm3.Task2.Product.ElectronicProduct;

import com.vdubyk.hm3.Task2.Customer.AgeRestriction;
import com.vdubyk.hm3.Task2.Product.ElectonicsProduct;

public class Appliance extends ElectonicsProduct {
    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        setGuaranteedPeriod(6);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() < 50) {
            return super.getPrice() * 1.05;
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
