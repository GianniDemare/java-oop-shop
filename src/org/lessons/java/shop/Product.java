package org.lessons.java.shop;

public class Prodotto {

    //ATTRIBUTI

    private int code;
    private String name;
    private String description;
    private int price;
    private int iva;

    // COSTRUTTORI

    public Prodotto(String name, String description, int price, int iva) {
        this.code = generateNumberRandom(1, 1000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }


    // METODI
    // METODO PER GENERARE UN NUMERO RANDOM PER IL CODICE
    private int generateNumberRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    // METODO PER AVERE IL NOME ESTESO CONCATENANDO CODICE E NOME
    public String toString(){
        return code + " " + name;
    }


}

