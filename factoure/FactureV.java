package uml;

import java.time.LocalDate;
import java.util.HashMap;

public class Facture {

    private int identifiant;
    private LocalDate date;
    private int montantHT = 0;
    private HashMap<Produit, Integer> produits;
    private int montantTTC = 0;
    private Client client;

    public Facture(int identifiant, LocalDate date, int montantHT, int montantTTC,
            HashMap<Produit, Integer> produit, Client client) {
        this.identifiant = identifiant;
        this.date = date;
        this.produits = produit;
        this.client = client;
        this.montantHT = montantHT;
        this.montantTTC = montantTTC;
        this.client = client;

    }

    
    public void ajouterProduit(Produit prod, int qte) {

        this.produits.put(prod, qte);

    }

    public void retirerProduit(Produit prod) {

        this.produits.remove(prod);

    }

    public void getFacture() {

        for (

        HashMap.Entry<Produit, Integer> pro : produits.entrySet()) {

            System.out.println("produit " + pro.getKey().getLibelle() + " qte:" + pro.getValue() + " pour un prix :"
                    + pro.getKey().getPrixHT() + " et un prix Totale TTC :"
                    + pro.getKey().getPrixTTC() * pro.getValue());

        }

        System.out.println("bonjour " + client.getMail() + " Vous avez acheter pour un montant HT de :" + montantHT
                + " et pour un cout TTC de:" + montantTTC + " a la date du " + date);
    }
}
