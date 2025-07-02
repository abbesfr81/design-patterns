package proxy.cachedictionnary;

public class DictPersistantProxy<T> implements DictPersistantIntf<T> {

    protected DictPersistant<T> dictPersistant = new DictPersistant<T>();
    protected Map<String, T> contenu = new TreeMap<String, T>();

    public boolean ajoute(String cle, T objet) {
        boolean resultat = dictPersistant.ajoute(cle, objet);
        if (resultat) {
            contenu.put(cle, objet);
        }
        return resultat;
    }

    public T get(String cle) {
        T resultat;
        resultat = contenu.get(cle);
        if (resultat == null) {
            resultat = dictPersistant.get(cle);
            if (resultat != null) {
                contenu.put(cle, resultat);
            }
        }
        return resultat;
    }
}
