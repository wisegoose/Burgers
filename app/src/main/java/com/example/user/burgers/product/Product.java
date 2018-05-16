package com.example.user.burgers.product;

import java.io.Serializable;




public class Product implements Serializable {

    private String pName;
    private int pPrice;
    private int pWeight;
    private String pDescription;
    private String pImage;


    public Product(){
        super();
    }

    public Product(String pName,int pWeight, int pPrice, String pDescription, String pImage){
        setName(pName);
        setPrice(pPrice);
        setWeight(pWeight);
        setDescription(pDescription);
        setImage(pImage);

        }


    public String getName (){
        return pName;
    }

    public void setName(String name) {
        this.pName = name;
    }

    public int getWeight() {
        return pWeight;
    }

    public void setWeight(int weight) {
        this.pWeight = weight;
    }

    public int getPrice() {
        return pPrice;
    }
    public void setPrice(int price) {
        this.pPrice = price;
    }

    public String getDescription() {
        return pDescription;
    }

    public void setDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public String getImage() {
        return pImage;
    }
    public void setImage(String image) {
        this.pImage = image;
    }

}

