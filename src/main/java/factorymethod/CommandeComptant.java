/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author abbesbelhoul
 */
public class CommandeComptant extends Commande {

    public CommandeComptant(double montant) {
        super(montant);
    }

    @Override
    public void paye() {
        System.out.println(
                "Le paiement de la commande au comptant de : " + montant + " est effectué.");
    }

    @Override
    public boolean valide() {
        return true;
    }

}
