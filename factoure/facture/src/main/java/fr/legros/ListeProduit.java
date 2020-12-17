package fr.legros;


import java.util.HashMap;

public class ListeProduit {

    private double htTotal = 0;
    private double ttcTotal = 0;

    private HashMap<Produit, Integer> liProd = new HashMap<Produit, Integer>();

    public ListeProduit() {
    
    }

    public void ajoutProduit(int qte, Produit prod) {

        liProd.put(prod, qte);
    }

    public double getTTC() {
        for (

        HashMap.Entry<Produit, Integer> pro : liProd.entrySet()) {

            ttcTotal += (pro.getKey().getPrixTTC() * pro.getValue());
        }
        return ttcTotal;
    }


    public double getHt() {
        for (

        HashMap.Entry<Produit, Integer> pro : liProd.entrySet()) {

            htTotal += (pro.getKey().getPrixHT() * pro.getValue());
        }
        return htTotal;

    }

    public HashMap<Produit, Integer> getList() {
        return liProd;
    }
}