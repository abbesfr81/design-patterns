/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public class Repertoire extends Noeud {

    protected List<Noeud> noeuds = new ArrayList<>();

    public Repertoire(Utilisateur utilisateur) {
        super(utilisateur);
    }

    @Override
    public void accepteVisiteur(VisiteurNoeud visiteur) {
        visiteur.visiteRepertoire(this);
        for (Noeud noeud : noeuds) {
            noeud.accepteVisiteur(visiteur);
        }
    }

    @Override
    public boolean ajouteNoeud(Noeud noeud) {
        return noeuds.add(noeud);
    }
}
