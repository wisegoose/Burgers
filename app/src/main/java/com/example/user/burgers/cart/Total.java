package com.example.user.burgers.cart;

import com.example.user.burgers.product.Product;

import java.util.List;

/**
 * Created by User on 18.04.2018.
 */

public class Total {

    public static int getTotal(List<Product> products){
        int total = 0;

        for (Product q: products){
            total += q.getPrice(); }
        return total;
    }
}
