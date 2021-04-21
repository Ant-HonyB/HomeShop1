package com.anthony.pOCR.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class Voiture extends Vehicule {
    private int porte;
    private int litrePar100Km;
    private String moteur;
    private List<String> options = new ArrayList<String>();

    public Voiture(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight, int porte, int litrePar100Km, String moteur, List<String> options) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
        this.porte = porte;
        this.litrePar100Km = litrePar100Km;
        this.moteur = moteur;
        this.options = options;
    }

    public void AllumerFeux() {
        System.out.println("J'allume mes phares");
    }

    public void OuvreCoffre() {
        System.out.println("J'ouvre le coffre");
    }

    public int getPorte() {
        return porte;
    }

    public int getLitrePar100Km() {
        return litrePar100Km;
    }

    public String getMoteur() {
        return moteur;
    }

    public List<String> getOptions() {
        return options;
    }

}
