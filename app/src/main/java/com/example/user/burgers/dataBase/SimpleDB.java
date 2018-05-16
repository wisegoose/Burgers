package com.example.user.burgers.dataBase;

import com.example.user.burgers.product.Product;

import java.util.ArrayList;
import java.util.List;



public class SimpleDB {

    private static final SimpleDB ourInstance = new SimpleDB();

    private static List<Product> burgers = new ArrayList<>();
    private static List<Product> snacks = new ArrayList<>();
    private static List<Product> drinks = new ArrayList<>();


    public static SimpleDB getInstance() {
        return ourInstance;
    }

    public static List<Product> getBurgers(){
        return burgers;
    }
    public static  List<Product> getSnacks(){
        return snacks;
    }
    public static List<Product> getDrinks(){
        return drinks;
    }




    private static final Product STAR = new Product("Star" ,500,390, "Our signature mega Burger with two juicy marble cutlets, oyster mushrooms, bacon, smoked homemade Suluguni, as well as cheddar cheese, seasoned with spicy mayonnaise and cranberry-rosemary sauce." , "img_burgers_star" );
    private static final Product RED_HOT = new Product("Red Hot" ,390,290, "Juicy cutlet of marbled beef, Suluguni cheese, eggplant, jalapeno pepper, seasoned with sweet-spicy tomato and spicy mayonnaise." , "img_burgers_red" );
    private static final Product CLASSIC = new Product("Classic" ,350,240, "Burger with juicy marble cutlet, cheddar cheese, fresh vegetables, spicy mayonnaise and homemade ketchup." , "img_burgers_classic" );

    private static final Product POTATOS = new Product("Potatos" ,500,200, "Farm potatoes with garlic butter and 3 sauces" , "img_snacks_potatos" );
    private static final Product NUGGETS = new Product("Nuggets" ,150,150, "Crispy chicken nuggets" , "img_snacks_nuggets" );
    private static final Product SHRIMPS = new Product("Shrimps" ,150,290, "grilled shrimps on a skewer with 2 sauces" , "img_snacks_shrimps" );

    private static final Product LEMONADE = new Product("Lemonade" ,500,150, "Our signature lemonade. Excellent combination of sweet chili pepper, passion fruit and pineapple." , "img_drinks_lemonade" );

    static {
        burgers.add(STAR);
        burgers.add(RED_HOT);
        burgers.add(CLASSIC);

        snacks.add(POTATOS);
        snacks.add(NUGGETS);
        snacks.add(SHRIMPS);

        drinks.add(LEMONADE);

    }


}
