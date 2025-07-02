/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Client {
  protected List<Commande> commandes = new ArrayList<Commande>();

  protected abstract Commande creeCommande(double montant);

  public void nouvelleCommande(double montant) {
    Commande commande = this.creeCommande(montant);
    if (commande.valide()) {
      commande.paye();
      commandes.add(commande);
    }
  }
}
