/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package builder;

/**
 *
 * @author abbesbelhoul
 */
public class ConstructeurLiasseVehiculeHtml extends ConstructeurLiasseVehicule {
  public ConstructeurLiasseVehiculeHtml() {
    liasse = new LiasseHtml();
  }

  public void construitBonDeCommande(String nomClient) {
    String document = "<HTML>Bon de commande Client : " + nomClient + "</HTML>";
    liasse.ajouteDocument(document);
  }

  public void construitDemandeImmatriculation(String nomDemandeur) {
    String document;
    document = "<HTML>Demande d’immatriculation Demandeur : " + nomDemandeur + "</HTML>";
    liasse.ajouteDocument(document);
  }
}