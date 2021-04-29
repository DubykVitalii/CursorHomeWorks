package com.vdubyk.hm3.Task2;

import com.vdubyk.hm3.Task2.Comparator.PriceProductComparator;
import com.vdubyk.hm3.Task2.Customer.AgeRestriction;
import com.vdubyk.hm3.Task2.Customer.Customer;
import com.vdubyk.hm3.Task2.Product.ElectronicProduct.Appliance;
import com.vdubyk.hm3.Task2.Product.ElectronicProduct.Computer;
import com.vdubyk.hm3.Task2.Product.FoodProduct;
import com.vdubyk.hm3.Task2.Product.Product;
import com.vdubyk.hm3.Task2.Service.PurchaseManager;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Customer vitalii = new Customer("Vitalii", 19, 3000);

        Product cigars = new Product("Cigars", 400, 5, AgeRestriction.ADULT);
        Product wine = new Product("Wine", 100, 200, AgeRestriction.ADULT);
        Product redBull = new Product("Red Bull", 25, 100, AgeRestriction.TEENAGER);
        Product jackDaniels = new Product("Jack Daniel", 250, 200, AgeRestriction.ADULT);
        Product milk = new FoodProduct("Milk", 20, 50, AgeRestriction.NONE, LocalDate.of(2023, Month.APRIL, 15));
        Product tomato = new FoodProduct("Tomato", 10, 500, AgeRestriction.NONE, LocalDate.of(2022, Month.APRIL, 10));
        Product apple = new FoodProduct("Apple", 15, 50, AgeRestriction.NONE, LocalDate.of(2021, Month.DECEMBER, 1));
        Product laptop = new Computer("Laptop", 500, 1200, AgeRestriction.NONE);
        Product appliance = new Appliance("Appliance", 300, 25, AgeRestriction.NONE);

        PurchaseManager.processPurchase(cigars, vitalii);
        PurchaseManager.processPurchase(redBull, vitalii);
        PurchaseManager.processPurchase(milk, vitalii);
        PurchaseManager.processPurchase(laptop, vitalii);
        PurchaseManager.processPurchase(wine, vitalii);

        Product[] products = {cigars, wine, redBull, jackDaniels, milk, tomato, apple, laptop, appliance};
        PriceProductComparator listCompareAdult = new PriceProductComparator();
        TreeSet<Product> listProductAdult = new TreeSet<>(listCompareAdult);


        TreeSet<FoodProduct> listProductFood = new TreeSet<>(FoodProduct::compareTo);

        ArrayList<Product> listProductExpirable = new ArrayList<>();

        for (Product product : products) {
            if (product instanceof FoodProduct) {
                listProductFood.add((FoodProduct) product);
            }
            if (product.getAgeRestriction() == AgeRestriction.ADULT) {
                listProductAdult.add(product);
            }
            if (product.getQuantity() <= 100) {
                listProductExpirable.add(product);
            }
        }


        System.out.println("List food product: ");
        listProductFood.forEach(System.out::println);
        System.out.println("Food product ExpirationDate: ");
        System.out.println(listProductFood.first());
        System.out.println("Sorted list adult product for price: ");
        listProductAdult.forEach(System.out::println);
        System.out.println("List expirable product(quantity<=100): ");
        listProductExpirable.forEach(System.out::println);


    }


}




