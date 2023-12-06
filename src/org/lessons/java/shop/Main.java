package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Penna" , "Colore rosso", 3.0d, 22d);
        Category category = new Category("Penna", "Colore rosso");
        System.out.println(product.getFullName());
        System.out.println(product.priceBase());
        System.out.println(product.calculatePriceWithVat());
        System.out.println(category.toString());

        System.out.println("------------------");

        Product product2 = new Product("Matita" , "Disegno tecnico", 1.50d, 22d);
        System.out.println(product2.getFullName());
        System.out.println(product2.priceBase());
        System.out.println(product2.calculatePriceWithVat());

        System.out.println("------------------");

        Product product3 = new Product("Compasso" , "Due aste", 5.0d, 22d);
        System.out.println(product3.getFullName());
        System.out.println(product3.priceBase());
        System.out.println(product3.calculatePriceWithVat());
    }
}


