package com.ibmr.shopping.models;

import java.io.Serializable;
import java.util.Observable;

@SuppressWarnings("serial")
public class Product implements Serializable {
    private String name;
    private int qty, image;

    public Product() {}

    public Product(String name, int qty, int image) {
        this.name = name;
        this.qty = qty;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void increaseQty() {
        if (this.qty < 999) {
            this.qty++;
            Cart.totalItems++;
        }
    }

    public void decreaseQty() {
        if (this.qty > 0) {
            this.qty--;
            Cart.totalItems--;
        }
    }
}
