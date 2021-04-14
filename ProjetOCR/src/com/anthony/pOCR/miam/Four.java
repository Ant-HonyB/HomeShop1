package com.anthony.pOCR.miam;

public class Four {
    private int puissance;
    private int capacite;
    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment) {
        System.out.println("L'aliment [" + aliment.nom + "] est en train de cuire...");
        System.out.println("La capacité du four est de " + capacite + " litres.");
        System.out.println("La puissance du four est de " + puissance + " degrés.");
        aliment.bienCuit = true;
        maintenir();
    }

    private void maintenir() {

    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        System.out.println("la puissance est désormais modifiée.");
        this.puissance = puissance;
    }
}
