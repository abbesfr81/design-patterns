package visitor;

public class SocieteSansFiliale extends Societe {
    public SocieteSansFiliale(String nom, String email,
            String adresse) {
        super(nom, email, adresse);
    }

    public void accepteVisiteur(Visiteur visiteur) {
        visiteur.visiteSocieteSansFiliale(this);
    }

    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }
}