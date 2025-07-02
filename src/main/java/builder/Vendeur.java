/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author abbesbelhoul
 */
public class Vendeur {

    protected ConstructeurLiasseVehicule constructeur;

    public Vendeur(ConstructeurLiasseVehicule constructeur) {
        this.constructeur = constructeur;
    }

    public Liasse construit(String nomClient) {
        constructeur.construitBonDeCommande(nomClient);
        constructeur.construitDemandeImmatriculation(nomClient);

        return constructeur.resultat();
    }
}
