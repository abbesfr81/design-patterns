package chainofresponsibility;

public class Vehicule extends ObjetBase {

    protected String description;

    public Vehicule(String description) {
        this.description = description;
    }

    @Override
    protected String description() {
        return description;
    }
}
