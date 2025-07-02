/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author abbesbelhoul
 */
public class CommandeCredit extends Commande {

    public CommandeCredit(double montant) {
        super(montant);
    }

    @Override
    public void paye() {
        System.out.println("Le paiement de la commande au crédit de : " + montant + " est effectué.");
    }

    @Override
    public boolean valide() {
        return (montant >= 1000.0) && (montant <= 5000.0);
    }
}
