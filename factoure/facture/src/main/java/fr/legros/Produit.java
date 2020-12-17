package fr.legros;


public class Produit {

    private int code;
    private String libelle;
    private double prixHT;
    private double prixTTC;
    private double tva;
    private String type;

    public Produit(int code, String libelle, double prixHT, double tva, String type) {
        this.code = code;
        this.libelle = libelle;
        this.prixHT = prixHT;
        this.prixTTC = prixHT + (prixHT * tva / 100);
        this.tva = tva;
        this.type = type;

    }

    public double getPrixTTC() {
        return prixTTC;
    }

    
    public double getPrixHT() {
        return prixHT;
    }

    public String getType() {
        return type;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getCode() {
        return code;
    }

}
