package decorator2;

public class ModeleDecorateur extends Decorateur {

    public ModeleDecorateur(ComposantGraphiqueVehicule composant) {
        super(composant);
    }

    protected void afficheInfosTechniques() {
        System.out.println(
                "Informations techniques du modèle");
    }

    @Override
    public void affiche() {
        super.affiche();
        this.afficheInfosTechniques();
    }
}
