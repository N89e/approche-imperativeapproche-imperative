package fr.algorithmie;

/**
 * Créer une classe CaracteresConsecutifs
 * Soit une chaine de caractères quelconque,
 * transformez cette chaîne en comptant les répétitions successives
 * (ex : "aaabbc" → "a3b2c1").
 * */

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String chaineCaract = "aaabbc";
        StringBuilder resultat = new StringBuilder();
        int count = 1;

        for (int i = 1; i < chaineCaract.length(); i++) {
            if (chaineCaract.charAt(i) == chaineCaract.charAt(i - 1)) {
                count++;
            } else {
                resultat.append(chaineCaract.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        // On ajoute le dernier groupe de caractères
        if (chaineCaract.length() > 0) {
            resultat.append(chaineCaract.charAt(chaineCaract.length() - 1)).append(count);
        }

        System.out.println(resultat.toString());
    }
}
