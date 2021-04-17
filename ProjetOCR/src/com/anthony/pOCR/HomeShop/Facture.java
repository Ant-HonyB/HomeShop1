package com.anthony.pOCR.HomeShop;

import java.util.Map;

public class Facture {
    private Client client;
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

    public client getClient() {
        return client;
    }

    public Map<Produit, Integer> getProduits() {
        return produits;
    }
}
