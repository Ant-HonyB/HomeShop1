package com.anthony.pOCR.HomeShop;

public class Main {
    public static void main(String[] args){
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge frigo = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Client client = new client("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Facture facture = new Facture(client);
        facture.addProduit(cafe, 1);
        facture.addProduit(tv, 1);
        facture.addProduit(frigo, 1);


    }
}
