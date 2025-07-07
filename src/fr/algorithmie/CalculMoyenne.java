package fr.algorithmie;

import java.util.Arrays;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        //Quelle est la moyenne des éléments du tableau ?
        double moy = Arrays.stream(array).average().getAsDouble();
        //String..format est nécessaire ici pour arrondir le résultat deux chiffres après la virgule
        System.out.println("Valeur moy dans le tableau : " + String.format("%.2f", moy));
        //Deuxième méthode si java inférieur à 21
        int somme = 0;
        for (int i = 0; i < array.length; i++) {
            somme += array[i];
        }
        float moyenne = (float) somme / array.length;
        System.out.println("Valeur moy dans le tableau (si version java < 21) : " + String.format("%.2f", moyenne));
    }
}
