/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author abbesbelhoul
 */
import java.util.*;

public class LiasseVierge extends Liasse {

    private static LiasseVierge _instance = null;

    private LiasseVierge() {
        documents = new ArrayList<Document>();
    }

    public static LiasseVierge Instance() {
        if (_instance == null) {
            _instance = new LiasseVierge();
        }
        return _instance;
    }

    public void ajoute(Document doc) {
        documents.add(doc);
    }

    public void retire(Document doc) {
        int indexDoc = documents.indexOf(doc);
        if (indexDoc > 0) {
            documents.remove(indexDoc);
        }
    }
}
