package visitor;

public class VisiteurMailingCommercial implements Visiteur {

    @Override
    public void visiteSocieteSansFiliale(SocieteSansFiliale societe) {
        System.out.println("Envoi d’un email à "
                + societe.getNom() + " adresse : " + societe.getEmail() + " Proposition commerciale pour votre société");
    }

    @Override
    public void visiteSocieteMere(SocieteMere societe) {
        System.out.println("Envoi d’un email à "
                + societe.getNom() + " adresse : " + societe.getEmail() + " Proposition commerciale pour votre groupe");
        System.out.println("Envoi d’un courrier à "
                + societe.getNom() + " adresse : "
                + societe.getAdresse() + " Proposition commerciale pour votre groupe");
    }
}
