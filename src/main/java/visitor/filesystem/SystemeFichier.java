/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 *
 * @author abbesbelhoul
 */
public class SystemeFichier {

    protected Repertoire racine;

    public SystemeFichier(Repertoire racine) {
        this.racine = racine;
    }

    public void accepteVisiteur(VisiteurNoeud visiteur) {
        racine.accepteVisiteur(visiteur);
    }
}
