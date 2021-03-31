package com.ibmr.shopping.models;

public class Cart {
    public static int totalItems = 0;

    public static String getTitle() {
        return "Produtos no Carrinho: " + totalItems;
    }
}
