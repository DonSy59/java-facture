package uml;

import java.util.HashMap;
import java.time.LocalDate;


public class Launcher {

    public static void main(String[] args) {
        
        LocalDate ldtParsed = LocalDate.parse("2017-03-29");
        TypeProduit luxe = new TypeProduit(19.8, "mobilier");
        int tvaLuxe = luxe.getTva();
        int prixHTtu = 100;
        TypeProduit pasTva = new TypeProduit(0, "info");
        int pTva = pasTva.getTva();
        int prixHTglo = 20;
        Produit tables = new Produit(5, "table", prixHTtu, tvaLuxe, luxe.getType());
        Produit souris = new Produit(20, "souris", prixHTglo, pTva, luxe.getType());
        
        Client client = new Particulier("Valentin.Martins@gmail.com");

        int ttc = tables.getPrixTTC();
        ListeProduit listePro = new ListeProduit();
        listePro.ajoueProduit(5, tables);
        listePro.ajoueProduit(20, souris);
        int prHT = listePro.getHt();
        int prTTC = listePro.getTTC();
        HashMap<Produit, Integer> map = listePro.getList();

        Facture mar = new Facture(1, ldtParsed, prHT, prTTC, map, client);

        System.out.println();
        System.out.println("Le TTC du produit est " + ttc);
        System.out.println();
        mar.getFacture();

    }
    
}
