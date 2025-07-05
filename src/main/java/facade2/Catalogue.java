package facade2;

import java.util.List;

public interface Catalogue {

    List<String> retrouveVehicules(int prixMin, int prixMax);
}
