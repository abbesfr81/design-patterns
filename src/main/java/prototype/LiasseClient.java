/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public class LiasseClient extends Liasse {

    public LiasseClient(String informations) {
        documents = new ArrayList<>();
        LiasseVierge laLiasseVierge = LiasseVierge.Instance();
        List<Document> documentsVierges = laLiasseVierge.getDocuments();
        for (Document document : documentsVierges) {
            Document copieDocument = document.duplique();
            copieDocument.remplit(informations);
            documents.add(copieDocument);
        }
    }

    public void affiche() {
        for (Document document : documents) {
            document.affiche();
        }
    }

    public void imprime() {
        for (Document document : documents) {
            document.imprime();
        }
    }
}
