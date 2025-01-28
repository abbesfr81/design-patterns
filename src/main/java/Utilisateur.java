/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import main.java.observer.Vehicule;
import main.java.observer.VueVehicule;

/**
 *
 * @author abbesbelhoul
 */
public class Utilisateur {

    public static void main(String[] args) {
        /*Formulaire formulaire = new Formulaire();
        formulaire.ajouteControle(new ZoneSaisie("Nom"));
        formulaire.ajouteControle(new ZoneSaisie("Prénom"));
        PopupMenu menu = new PopupMenu("Coemprunteur");
        menu.ajouteOption("sans coemprunteur");
        menu.ajouteOption("avec coemprunteur");
        formulaire.ajouteControle(menu);
        formulaire.setMenuCoemprunteur(menu);
        Bouton bouton = new Bouton("OK");
        formulaire.ajouteControle(bouton);
        formulaire.setBoutonOK(bouton);
        formulaire.ajouteControleCoemprunteur(new ZoneSaisie(
                "Nom du coemprunteur"));
        formulaire.ajouteControleCoemprunteur(new ZoneSaisie(
                "Prénom du coemprunteur"));
        formulaire.saisie(); */

        // pattern momento
        /*  Memento memento;
        OptionVehicule option1 = new OptionVehicule("Sièges en cuir");
        OptionVehicule option2 = new OptionVehicule("Accoudoirs");
        OptionVehicule option3 = new OptionVehicule("Sièges sportifs");
        option1.ajouteOptionIncompatible(option3);
        option2.ajouteOptionIncompatible(option3);
        ChariotOption chariotOptions = new ChariotOption();
        chariotOptions.ajouteOption(option1);
        chariotOptions.ajouteOption(option2);
        chariotOptions.affiche();
        memento = chariotOptions.ajouteOption(option3);
        chariotOptions.affiche();
        chariotOptions.annule(memento);
        chariotOptions.affiche();
         */
        // pattern observer
        Vehicule vehicule = new Vehicule();
        vehicule.setDescription("Véhicule bon marché");
        vehicule.setPrix(5000.0);
        VueVehicule vueVehicule = new VueVehicule(vehicule);
        vueVehicule.affiche();
        vehicule.setPrix(4500.0);
        vueVehicule.affiche();
        VueVehicule vueVehicule2 = new VueVehicule(vehicule);
        vehicule.setPrix(5500.0);
        vueVehicule.affiche();
        vueVehicule2.affiche();

    }
}
