package com.vdubyk.hm3.Task2.Comparator;

import com.vdubyk.hm3.Task2.Product.Product;

import java.util.Comparator;

public class PriceProductComparator implements Comparator<Product> {


    public int compare(Product a,Product b) {

        if(a.getPrice()> b.getPrice())
            return 1;
        else if(a.getPrice()< b.getPrice())
            return -1;
        else
            return 0;
    }

}
