/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package factorymethod;

/**
 *
 * @author abbesbelhoul
 */
public class ClientComptant extends Client {
  protected Commande creeCommande(double montant) {
    return new CommandeComptant(montant);
  }
}
