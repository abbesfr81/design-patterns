/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package builder;

/**
 *
 * @author abbesbelhoul
 */
public abstract class ConstructeurLiasseVehicule {
  protected Liasse liasse;

  public abstract void construitBonDeCommande(String nomClient);

  public abstract void construitDemandeImmatriculation(String nomDemandeur);

  public Liasse resultat() {
    return liasse;
  }
}
