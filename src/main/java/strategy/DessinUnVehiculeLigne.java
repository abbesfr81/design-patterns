package strategy;

import java.util.List;

public class DessinUnVehiculeLigne implements DessinCatalogue {

    @Override
    public void dessine(List<VueVehicule> contenu) {
        System.out.println(
                "Dessine les véhicules avec un véhicule par ligne");
        for (VueVehicule vueVehicule : contenu) {
            vueVehicule.dessine();
            System.out.println();
        }
        System.out.println();
    }
}
