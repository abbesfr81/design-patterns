/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 *
 * @author abbesbelhoul
 */
public class VisiteurTaille extends VisiteurNoeud {

    protected int tailleTotale = 0;

    @Override
    public void visiteFichier(Fichier fichier) {
        tailleTotale = tailleTotale + fichier.getTaille();
    }

    @Override
    public void visiteRepertoire(Repertoire repertoire) {
    }

    public int getTailleTotale() {
        return tailleTotale;
    }
}
