package com.vdubyk.hm3.Task2.Service;

import com.vdubyk.hm3.Task2.Customer.Customer;
import com.vdubyk.hm3.Task2.Exception.AgeExeption;
import com.vdubyk.hm3.Task2.Exception.BalanceException;
import com.vdubyk.hm3.Task2.Exception.DateExeption;
import com.vdubyk.hm3.Task2.Exception.QuantityException;
import com.vdubyk.hm3.Task2.Product.Product;

public class PurchaseManager {

    private static boolean isAgeRestriction = false;
    private static boolean isQuantity = false;
    private static boolean isBalance = false;

    public static void processPurchase(Product product, Customer customer) throws
            AgeExeption, BalanceException, QuantityException, DateExeption {
        if (customer.getAgeRestriction().compareTo(product.getAgeRestriction()) >= 0) {
            isAgeRestriction = true;
            if (product.getQuantity() > 0) {
                isQuantity = true;
                if (product.getPrice() <= customer.getBalance()) {
                    isBalance = true;
                } else {
                    isBalance = false;
                    throw new BalanceException("You do not have enough money to buy this product!");
                }
            } else {
                isQuantity = false;
                throw new QuantityException("Not enough product\n");
            }
        } else {
            isAgeRestriction = false;
            throw new AgeExeption("You are too young to buy this product!\n");
        }

        if (isAgeRestriction && isQuantity && isBalance) {
            customer.setBalance(customer.getBalance() - product.getPrice());
            product.setQuantity(product.getQuantity() - 1);
            System.out.println("The purchase is successful. Customer " + customer.getName() + " bought " + product.getName() + " for " + product.getPrice());
        }

    }
}

