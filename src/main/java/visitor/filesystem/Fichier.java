/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 *
 * @author abbesbelhoul
 */
public class Fichier extends Noeud {

    protected int taille;

    public Fichier(Utilisateur utilisateur, int taille) {
        super(utilisateur);
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    @Override
    public void accepteVisiteur(VisiteurNoeud visiteur) {
        visiteur.visiteFichier(this);
    }

    @Override
    public boolean ajouteNoeud(Noeud noeud) {
        return false;
    }
}
