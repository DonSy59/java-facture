package uml;

public class Entreprise extends Client {
    // fait par valentin martins
    private String siret = "";

    public Entreprise(String mail, String siret) {
        super(mail);
        this.siret = siret;
    }

    public String getSiret() {
        return siret;
    }
} // fait par valentin martins