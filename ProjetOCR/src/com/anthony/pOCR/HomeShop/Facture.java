package com.anthony.pOCR.HomeShop;

public class Facture {
    private Customer customer;
    private Map<Produit, Integer> produits;

    public Facture(Client client) {
        this.client = client;
    }

    /**
     * Ajoute un produit avec sa quantité sur la facture
     * @param produit le produit à ajouter
     * @param quantite la quantité du produit
     */
    public void addProduit(Produit produit, Integer quantite) {
        this.produits.put(produit, quantite);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Produit, Integer> getProduits() {
        return produits;
    }
}
