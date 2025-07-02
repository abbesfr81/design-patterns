/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package factorymethod;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Commande {
  protected double montant;

  public Commande(double montant) {
    this.montant = montant;
  }

  public abstract boolean valide();

  public abstract void paye();
}
