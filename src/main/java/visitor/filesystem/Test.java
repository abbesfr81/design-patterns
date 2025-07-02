/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor.filesystem;

/**
 * ∏
 *
 * @author abbesbelhoul
 */
public class Test {

    public static void main(String[] args) {
        Utilisateur moiMeme = new Utilisateur("moi même");
        Repertoire racine = new Repertoire(moiMeme);
        Repertoire rep = new Repertoire(moiMeme);
        racine.ajouteNoeud(rep);
        racine.ajouteNoeud(new Fichier(moiMeme, 100));
        racine.ajouteNoeud(new Fichier(moiMeme, 200));
        rep.ajouteNoeud(new Fichier(moiMeme, 1000));
        rep.ajouteNoeud(new Fichier(moiMeme, 2000));
        rep.ajouteNoeud(new Fichier(moiMeme, 3000));
        SystemeFichier systemeFichier = new SystemeFichier(racine);
        VisiteurNombre visiteurNombre = new VisiteurNombre();
        systemeFichier.accepteVisiteur(visiteurNombre);
        System.out.println(
                "Nombre de fichiers du système de fichiers : "
                + visiteurNombre.getNombreFichiers());
        System.out.println(
                "Nombre de répertoires du système de fichiers : "
                + visiteurNombre.getNombreRepertoires());
        VisiteurTaille visiteurTaille = new VisiteurTaille();
        systemeFichier.accepteVisiteur(visiteurTaille);
        System.out.println("Taille du système de fichiers : "
                + visiteurTaille.getTailleTotale());
    }
}
