/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicast;

/**
 *
 * @author abbesbelhoul
 */
public class MessageCommercial extends MessageAbstrait {

    protected String contenu;

    public String getContenu() {
        return contenu;
    }

    public MessageCommercial(String contenu) {
        super();
        this.contenu = contenu;
    }
}
