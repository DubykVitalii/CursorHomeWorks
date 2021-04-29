package com.vdubyk.hm3.Task2.Customer;

public class Customer {
    private String name;
    private int age;
    private double balance;
    private AgeRestriction ageRestriction;

    public Customer(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        ageRestrictionCustomer();
    }

    private void ageRestrictionCustomer() {
        if (this.age >= 0 && this.age <= 17) {
            ageRestriction = AgeRestriction.TEENAGER;
        } else {
            ageRestriction = AgeRestriction.ADULT;
        }
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", ageRestriction=" + ageRestriction +
                '}';
    }
}
