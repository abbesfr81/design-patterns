/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicast;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public class DirectionGenerale {

    protected ExpediteurGeneral expediteurGeneral = new ExpediteurGeneral();

    public void envoieMessages() {
        List<String> contenu = new ArrayList<>();
        contenu.add("Informations générales");
        contenu.add("Informations spécifiques");
        MessageGeneral message = new MessageGeneral(contenu);
        expediteurGeneral.envoieMultiple(message);
    }

    public void ajouteRecepteurGeneral(Employe recepteur) {
        expediteurGeneral.ajoute(recepteur);
    }
}
