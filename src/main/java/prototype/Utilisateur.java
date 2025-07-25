package prototype;

public class Utilisateur {

    public static void main(String[] args) {
// initialisation de la liasse vierge
        LiasseVierge liasseVierge = LiasseVierge.Instance();
        liasseVierge.ajoute(new BonDeCommande());
        liasseVierge.ajoute(new CertificatCession());
        liasseVierge.ajoute(new DemandeImmatriculation());
// création d’une nouvelle liasse pour deux clients
        LiasseClient liasseClient1 = new LiasseClient("Martin");
        LiasseClient liasseClient2 = new LiasseClient("Durant");
        liasseClient1.affiche();
        liasseClient2.affiche();
    }
}
