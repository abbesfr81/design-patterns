/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package builder;

/**
 *
 * @author abbesbelhoul
 */
public class LiasseHtml extends Liasse {
  @Override
  public void ajouteDocument(String document) {
    if (document.startsWith("<HTML>"))
      contenu.add(document);
  }

  @Override
  public void imprime() {
    System.out.println("Liasse HTML");
    for (String s : contenu)
      System.out.println(s);
  }
}