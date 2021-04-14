package com.anthony.pOCR.miam;

public class Four {
    int puissance;
    int capacite;

    public void cuire(Aliment aliment) {
        System.out.println("L'aliment [" + aliment.nom + "] est en train de cuire...");
        System.out.println("La capacité du four est de " + capacite + " litres.");
        System.out.println("La puissance du four est de " + puissance + " degrés.");
        aliment.bienCuit = true;
    }
}
