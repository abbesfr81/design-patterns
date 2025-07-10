package iterator;

public class Vehicule extends Element {

    public Vehicule(String description) {
        super(description);
    }

    public void affiche() {
        System.out.println("Description du véhicule : " + description);
    }
}
