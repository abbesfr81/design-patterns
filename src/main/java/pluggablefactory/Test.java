package pluggablefactory;

public class Test {
    public static void main(String[] args) {
        
        Automobile protoAutomobileStandardBleu = new AutomobileElectricite();
        protoAutomobileStandardBleu.setModele("standard");
        protoAutomobileStandardBleu.setCouleur("bleu");

        Scooter protoScooterClassicRouge = new ScooterEssence();
        protoScooterClassicRouge.setModele("classic");
        protoScooterClassicRouge.setCouleur("rouge");

        FabriqueVehicule fabrique = new FabriqueVehicule();
        fabrique.setPrototypeAutomobile(protoAutomobileStandardBleu);
        fabrique.setPrototypeScooter(protoScooterClassicRouge);

        Automobile auto = fabrique.creeAutomobile();
        auto.afficheCaracteristiques();

        Scooter scooter = fabrique.creeScooter();
        scooter.afficheCaracteristiques();

        Automobile protoAutomobile2NewNoir = new AutomobileEssence();
        protoAutomobile2NewNoir.setModele("new");
        protoAutomobile2NewNoir.setCouleur("noir");
        fabrique.setPrototypeAutomobile(protoAutomobile2NewNoir);

        Automobile automobile = fabrique.creeAutomobile();
        automobile.afficheCaracteristiques();
    }
}