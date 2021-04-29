package com.vdubyk.hm3.Task2.Product;

import com.vdubyk.hm3.Task2.Customer.AgeRestriction;
import com.vdubyk.hm3.Task2.Interface.Buyable;

public class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private AgeRestriction ageRestriction;


    public Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + quantity +
                ", ageRestriction=" + ageRestriction +
                '}';
    }


}
