/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package builder;

/**
 *
 * @author abbesbelhoul
 */
public class ConstructeurLiasseVehiculePdf extends
    ConstructeurLiasseVehicule {
  public ConstructeurLiasseVehiculePdf() {
    liasse = new LiassePdf();
  }

  public void construitBonDeCommande(String nomClient) {
    String document = "<PDF>Bon de commande Client : " + nomClient + "</PDF>";
    liasse.ajouteDocument(document);
  }

  public void construitDemandeImmatriculation(String nomDemandeur) {
    String document = "<PDF>Demande d’immatriculation Demandeur : " + nomDemandeur + "</PDF>";
    liasse.ajouteDocument(document);
  }
}
