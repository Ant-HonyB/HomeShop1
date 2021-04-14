package com.anthony.pOCR.miam;

public class Aliment {
    String nom;
    boolean bienCuit;

    public void manger() {
        if (bienCuit) {
            System.out.println("Mmmmmh... L'aliment [" + nom + "] est super bien cuit !");
        } else {
            System.out.println("Eurk... L'aliment [" + nom + "] est encore cru ! Il faudrait l'enfourner !");
        }
    }


}
