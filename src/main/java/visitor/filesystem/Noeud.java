/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Noeud {

    protected Utilisateur utilisateur;

    public Noeud(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public abstract boolean ajouteNoeud(Noeud noeud);

    public abstract void accepteVisiteur(VisiteurNoeud visiteur);
}
