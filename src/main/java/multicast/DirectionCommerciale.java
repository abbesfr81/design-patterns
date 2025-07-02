/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicast;

/**
 *
 * @author abbesbelhoul
 */
public class DirectionCommerciale {

    protected ExpediteurCommercial expediteurCommercial = new ExpediteurCommercial();

    public void envoieMessages() {
        MessageCommercial message = new MessageCommercial("Annonce nouvelle gamme");
        expediteurCommercial.envoieMultiple(message);
        message = new MessageCommercial("Annonce suppression modèle");
        expediteurCommercial.envoieMultiple(message);
    }

    public void ajouteRecepteurCommercial(RecepteurCommercial recepteur) {
        expediteurCommercial.ajoute(recepteur);
    }
}
