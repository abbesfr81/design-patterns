/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 *
 * @author abbesbelhoul
 */
public abstract class VisiteurNoeud {

    public abstract void visiteFichier(Fichier fichier);

    public abstract void visiteRepertoire(Repertoire repertoire);

}
