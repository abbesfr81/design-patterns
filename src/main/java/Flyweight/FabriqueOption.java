package Flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FabriqueOption {

    protected Map<String, OptionVehicule> options = new TreeMap<String, OptionVehicule>();

    public OptionVehicule getOption(String nom) {
        OptionVehicule resultat;
        resultat = options.get(nom);
        if (resultat == null) {
            resultat = new OptionVehicule(nom);
            options.put(nom, resultat);
        }
        return resultat;
    }
}
