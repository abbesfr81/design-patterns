package visitor;

public interface Visiteur {
    void VisiteSocieteSansFiliale(SocieteSansFiliale societe);
    void VisiteSocieteMere(SocieteMere societe);
}