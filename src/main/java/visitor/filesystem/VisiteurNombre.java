/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 *
 * @author abbesbelhoul
 */
public class VisiteurNombre extends VisiteurNoeud {

    protected int nombreFichiers = 0;
    protected int nombreRepertoires = 0;

    @Override
    public void visiteFichier(Fichier fichier) {
        nombreFichiers = nombreFichiers + 1;
    }

    @Override
    public void visiteRepertoire(Repertoire repertoire) {
        nombreRepertoires = nombreRepertoires + 1;
    }

    public int getNombreFichiers() {
        return nombreFichiers;
    }

    public int getNombreRepertoires() {
        return nombreRepertoires;
    }
}
