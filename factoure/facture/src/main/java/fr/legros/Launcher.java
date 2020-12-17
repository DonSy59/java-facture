package fr.legros;

import java.util.HashMap;
import java.time.LocalDate;


public class Launcher {

    public static void main(String[] args) {
        
        LocalDate ldtParsed = LocalDate.parse("2017-03-29");
        TypeProduit luxe = new TypeProduit(18.9, "mobilier");
        double tvaLuxe = luxe.getTva();
        int prixHTtu = 100;
        TypeProduit pasTva = new TypeProduit(0, "info");
        double pTva = pasTva.getTva();
        int prixHTglo = 20;
        Produit tables = new Produit(7, "table", prixHTtu, tvaLuxe, luxe.getType());
        Produit souris = new Produit(20, "clavier", prixHTglo, pTva, luxe.getType());
        
        Client client = new Particulier("pierre.legros@gmail.com");

        double ttc = tables.getPrixTTC();
        ListeProduit listePro = new ListeProduit();
        listePro.ajoueProduit(5, tables);
        listePro.ajoueProduit(20, souris);
        double prHT = listePro.getHt();
        double prTTC = listePro.getTTC();
        HashMap<Produit, Integer> map = listePro.getList();

        Facture mar = new Facture(1, ldtParsed, prHT, prTTC, map, client);

        System.out.println();
        System.out.println("Le TTC du produit est " + ttc);
        System.out.println();
        mar.getFacture();

    }
    
}
