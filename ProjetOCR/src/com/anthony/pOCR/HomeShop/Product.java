package com.anthony.pOCR.HomeShop;

public class Product {
    private String nom;
    private String description;
    private double prix;

    public Product(String nom, String description, double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    /**
     * Premiere methode : Affiche une description complête du produit
     */
    public void coupDoeil(){

    }

    /**
     * Ajoute le produit à une facture
     * @param facture la facture concernée
     * @param quantite la quantité du produit à ajouter
     */
    public void acheter(Facture facture, Integer quantite) {

    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
