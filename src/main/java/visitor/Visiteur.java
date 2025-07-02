package visitor;

public interface Visiteur {
    void visiteSocieteSansFiliale(SocieteSansFiliale societe);
    void visiteSocieteMere(SocieteMere societe);
}