/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package prototype;

/**
 *
 * @author abbesbelhoul
 */
public abstract class Document implements Cloneable {
  protected String contenu = new String();

  public Document duplique() {
    Document resultat;
    try {
      resultat = (Document) this.clone();
    } catch (CloneNotSupportedException exception) {
      return null;
    }
    return resultat;
  }

  public void remplit(String informations) {
    contenu = informations;
  }

  public abstract void imprime();

  public abstract void affiche();
}
