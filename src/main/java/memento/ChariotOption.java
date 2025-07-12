/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.*;

public class ChariotOption {

    protected List<OptionVehicule> options = new ArrayList<OptionVehicule>();

    public Memento ajouteOption(OptionVehicule optionVehicule) {
        MementoImpl resultat = new MementoImpl();
        resultat.setEtat(options);
        options.removeAll(optionVehicule.getOptionsIncompatibles());
        options.add(optionVehicule);
        return resultat;
    }

    public void annule(Memento memento) {
        MementoImpl mementoImplInstance;
        try {
            mementoImplInstance = (MementoImpl) memento;
        } catch (ClassCastException e) {
            return;
        }
        options = mementoImplInstance.getEtat();
    }

    public void affiche() {
        System.out.println("Contenu du chariot des options");
        for (OptionVehicule option : options) {
            option.affiche();
        }
        System.out.println();
    }
}
