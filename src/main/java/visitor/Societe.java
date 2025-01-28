package visitor;

public abstract class Societe {
    protected String nom, email, adresse;

    public Societe(String nom, String email, String adresse) {
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public abstract boolean ajouteFiliale(Societe filiale);

    public abstract void accepteVisiteur(Visiteur visiteur);
}