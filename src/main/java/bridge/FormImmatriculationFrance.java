package bridge;

public class FormImmatriculationFrance extends FormulaireImmatriculation {

    public FormImmatriculationFrance(FormulaireImpl implantation) {
        super(implantation);
    }

    @Override
    protected boolean controleSaisie(String plaque) {
        return (plaque.length() >= 7)
                && (plaque.length() <= 8);
    }
}
