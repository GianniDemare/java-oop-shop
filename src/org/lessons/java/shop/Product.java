package org.lessons.java.shop;

public class Product {

    //ATTRIBUTI

    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;
    private Category prodCategory;

    // COSTRUTTORI

    public Product(String name, String description, double price, double vat, Category prodCategory) {

        // Controllo per il nome del prodotto
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("il nome del prodotto non può essere nullo o vuoto!");
        }

        // Controllo per il prezzo del prodotto
        if (price < 0) {
            throw new IllegalArgumentException("il prezzo del prodotto non può essere negativo!");
        }

        // Controllo per l'aliquota IVA
        if (vat < 0) {
            throw new IllegalArgumentException("l'IVA deve essere maggiore di 0!");
        }

        this.code = generateNumberRandom(1, 1000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
        this.prodCategory = prodCategory;
    }


    // GETTER E SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setIva(double vat) {
        this.vat = vat;
    }

    public Category getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(Category prodCategory) {
        this.prodCategory = prodCategory;
    }

    // METODI

    // METODO PER GENERARE UN NUMERO RANDOM PER IL CODICE
    private int generateNumberRandom(int min, int max) {

        return min + (int) (Math.random() * ((max - min) + 1));
    }

    // METODO PER AVERE IL PREZZO BASE + CONTROLLO CHE NON SIA STATO INSERITO UN PREZZO NEGATIVO
    public double priceBase() {
        if (price >= 0) {
            return price;
        } else {
            // Se il prezzo è negativo, stampa un messaggio di errore
            System.err.println("Errore: Il prezzo base del prodotto non può essere negativo.");
            return 0;
        }
    }

    // METODO PER AVERE UN PREZZO COMPRESIVO DI IVA
    public double calculatePriceWithVat(){
        if (vat >= 0){
            return (price * vat) / 100 + price;
        } else {
            // Se l'IVA è negativa, stampa un messaggio di errore
            System.err.println("Errore: L'IVA non può essere negativa.");
            return 0;
        }
    }

    // METODO PER AVERE IL NOME ESTESO CONCATENANDO CODICE E NOME
    public String getFullName(){

        return code + "-" + name;
    }


}

