/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicast;

/**
 *
 * @author abbesbelhoul
 */
public class Commercial extends Employe {

    protected RecepteurCommercial recepteurCommercial = new RecepteurCommercial() {
        @Override
        public void recoit(MessageCommercial message) {
            System.out.println("Nom : " + nom);
            System.out.println("Message : " + message.getContenu());
        }
    };

    public Commercial(String nom) {
        super(nom);
    }

    public RecepteurCommercial getRecepteurCommercial() {
        return recepteurCommercial;
    }
}
