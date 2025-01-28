/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Sujet {

    protected List<Observateur> observateurs = new ArrayList<Observateur>();

    public void ajoute(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void retire(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void notifie() {
        for (Observateur observateur : observateurs) {
            observateur.actualise();
        }
    }
}
