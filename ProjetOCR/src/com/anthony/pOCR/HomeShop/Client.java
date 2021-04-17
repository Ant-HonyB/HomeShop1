package com.anthony.pOCR.HomeShop;

public class Client {
    private String nomComplet;
    private String adresse;

    public Client(String nomComplet, String adresse) {
        this.nomComplet = nomComplet;
        this.adresse = adresse;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getAdresse() {
        return adresse;
    }

}
