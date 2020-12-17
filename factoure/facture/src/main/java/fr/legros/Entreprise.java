package fr.legros;

public class Entreprise extends Client {
   
    private String siret = "";

    public Entreprise(String mail, String siret) {
        super(mail);
        this.siret = siret;
    }

    public String getSiret() {
        return siret;
    }
} 