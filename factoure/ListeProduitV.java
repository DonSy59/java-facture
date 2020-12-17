package uml;

// fait par valentin martins
import java.util.HashMap;

public class ListeProduit {

    private double htTotal = 0;
    private double ttcTotal = 0;

    private HashMap<Produit, Integer> liProd = new HashMap<Produit, Integer>();

    public ListeProduit() {
        // fait par valentin martins
    }

    public void ajoueProduit(int qte, Produit prod) {

        liProd.put(prod, qte);
    }

    public double getTTC() {
        for (

        HashMap.Entry<Produit, Integer> pro : liProd.entrySet()) {

            ttcTotal += (pro.getKey().getPrixTTC() * pro.getValue());
        }
        return ttcTotal;
    }

    // fait par valentin martins
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