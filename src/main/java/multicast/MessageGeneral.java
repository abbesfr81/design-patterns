/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicast;

import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public class MessageGeneral extends MessageAbstrait {

    protected List<String> contenu;

    public List<String> getContenu() {
        return contenu;
    }

    public MessageGeneral(List<String> contenu) {
        super();
        this.contenu = contenu;
    }
}
