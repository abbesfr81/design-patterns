/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package factorymethod;

/**
 *
 * @author abbesbelhoul
 */
public class Utilisateur {
  public static void main(String[] args) {
    Client client = new ClientComptant();
    client.nouvelleCommande(2000.0);
    client.nouvelleCommande(10000.0);
    client = new ClientCredit();
    client.nouvelleCommande(2000.0);
    client.nouvelleCommande(10000.0);
  }
}
