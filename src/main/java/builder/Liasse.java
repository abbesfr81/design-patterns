/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Liasse {

    protected List<String> contenu = new ArrayList<String>();
    public abstract void ajouteDocument(String document);

    public abstract void imprime();
}
