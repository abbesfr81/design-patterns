package main.java;

import java.util.Scanner;

public class Bouton extends Controle {

    Scanner reader = new Scanner(System.in);

    public Bouton(String nom) {
        super(nom);
    }

    @Override
    public void saisie() {
        System.out.println("Désirez-vous activer le bouton " + nom + " ?");
        String reponse = reader.nextLine();
        if (reponse.equals("oui")) {
            this.modifie();
        }

    }

}
