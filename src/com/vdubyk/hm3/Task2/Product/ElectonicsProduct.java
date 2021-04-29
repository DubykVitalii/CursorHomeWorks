package com.vdubyk.hm3.Task2.Product;

import com.vdubyk.hm3.Task2.Customer.AgeRestriction;

public class ElectonicsProduct extends Product {

    private int guaranteedPeriod;

    public ElectonicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public int getGuaranteedPeriod() {
        return guaranteedPeriod;
    }

    public void setGuaranteedPeriod(int guaranteedPeriod) {
        this.guaranteedPeriod = guaranteedPeriod;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                ", guaranteedPeriod=" + this.guaranteedPeriod +
                '}';
    }
}
