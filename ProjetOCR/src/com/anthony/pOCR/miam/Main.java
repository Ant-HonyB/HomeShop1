package com.anthony.pOCR.miam;

public class Main {

    public static void main(String[] args){
        Four petitFour = new Four();
        petitFour.capacite = 30;
        petitFour.puissance = 180;

        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

        Aliment gateau = new Aliment();
        gateau.nom = "flanBienMoelleux";
        gateau.bienCuit = false;

        gateau.manger();
        System.out.println("");

        grandFour.cuire(gateau);
        System.out.println("");

        gateau.manger();
    }
}
