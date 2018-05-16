package com.example.user.burgers.cart;

import com.example.user.burgers.product.Product;

import java.util.ArrayList;
import java.util.List;


public class CartModel {
    private static final CartModel ourInstance = new CartModel();
    private static List<Product> cart = new ArrayList<>();

    public CartModel() {
    }

    public static CartModel getInstance() {
        return ourInstance;
    }
    public static List<Product> getCart(){
        return cart;
    }
    public void  setCart(List<Product> cart){
        this.cart = cart;
    }
    public static void addProduct(Product p){
        cart.add(p);
    }




}
