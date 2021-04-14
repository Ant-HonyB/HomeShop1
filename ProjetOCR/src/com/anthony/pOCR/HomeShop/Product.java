package com.anthony.pOCR.HomeShop;

public class Produit {
    String name;
    String descrption;
    double price;

    /**
     * Premiere methode : Affiche une description complête du produit
     */
    public void look(){

    }

    /**
     * Ajoute le produit à une facture
     * @param bill la facture concernée
     * @param quantity la quantité du produit à ajouter
     */
    public void buy(Bill bill, Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public String getDescrption() {
        return descrption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
