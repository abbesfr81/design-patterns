package interpretor;

public abstract class Expression {

    public abstract boolean evalue(String description);

    // partie analyse syntaxique
    static protected String source;
    static protected int index;
    static protected String jeton;

    static protected void prochainJeton() {
        while ((index < source.length()) && (source.charAt(index) == ' ')) {
            index++;
        }
        if (index == source.length()) {
            jeton = null;
        } else if ((source.charAt(index) == '(')
                || (source.charAt(index) == ')')) {
            jeton = source.substring(index, index + 1);
            index++;
        } else {
            int debut = index;
            while ((index < source.length()) && (source.charAt(index) != ' ') && (source.charAt(index) != ')')) {
                index++;
            }
            jeton = source.substring(debut, index);
        }
    }

    static public Expression analyse(String source) throws Exception {
        Expression.source = source;
        index = 0;
        prochainJeton();
        return OperateurOu.parse();
    }

    static public Expression parse() throws Exception {
        Expression resultat;
        if (jeton.equals("(")) {
            prochainJeton();
            resultat = OperateurOu.parse();
            if (jeton == null) {
                throw new Exception("Erreur de syntaxe");
            }
            if (!jeton.equals(")")) {
                throw new Exception("Erreur de syntaxe");
            }
            prochainJeton();
        } else {
            resultat = MotCle.parse();
        }
        return resultat;
    }
}
