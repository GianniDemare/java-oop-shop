package org.lessons.java.shop;

public class Product {

    //ATTRIBUTI

    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    // COSTRUTTORI

    public Product(String name, String description, double price, double vat) {
        this.code = generateNumberRandom(1, 1000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setIva(int vat) {
        this.vat= vat;
    }


    // METODI

    // METODO PER GENERARE UN NUMERO RANDOM PER IL CODICE
    private int generateNumberRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    // METODO PER AVERE IL PREZZO BASE
    public String priceBase(){
        return "Il prezzo base è: " + price;
    }

    // METODO PER AVERE UN PREZZO COMPRESIVO DI IVA
    public double calculatePriceWithVat(){
        return (price * vat) / 100 + price;
    }
    // METODO PER AVERE IL NOME ESTESO CONCATENANDO CODICE E NOME
    public String getFullName(){
        return code + "-" + name;
    }


}

