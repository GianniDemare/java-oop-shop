package org.lessons.java.shop;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Category category = new Category("Penna Stilografica", "Inchiostro fluido che rende la scrittura semplice e scorrevole");
            Product product = new Product("Penna", "Colore rosso", 3d, 22d, category);

            System.out.println("Full name: " + product.getFullName());
            System.out.println("Price without iva: " + product.priceBase() + "€");
            System.out.println("Price with iva (" + product.getVat() + "%): " + product.calculatePriceWithVat() + "€");

            System.out.println("Product category information:");
            System.out.println("Category name: " + product.getProdCategory().getName());
            System.out.println("Category description: " + product.getProdCategory().getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("Attenzione c'è un errore, " + e.getMessage());
        }
    }
}