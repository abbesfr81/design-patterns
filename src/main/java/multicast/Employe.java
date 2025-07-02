/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicast;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Employe implements RecepteurGeneral {

    protected String nom;

    public Employe(String nom) {
        super();
        this.nom = nom;
    }

    @Override
    public void recoit(MessageGeneral message) {
        System.out.println("Nom : " + nom);
        System.out.println("Message : ");
        for (String ligne : message.getContenu()) {
            System.out.println(ligne);
        }
    }
}
