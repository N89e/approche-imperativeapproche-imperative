package fr.algorithmie;

import java.util.Arrays;
/**
 * Additionne deux tableaux d'entiers de tailles différentes.
 * Si un tableau est plus court, on ajoute la valeurParDefaut pour les indices manquants.
 *
 * @param array1 Premier tableau d'entiers
 * @param array2 Deuxième tableau d'entiers
 * @param valeurParDefaut Valeur utilisée pour les indices manquants
 * @return Un tableau contenant la somme élément par élément
 */
public final class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        // On prend la taille du plus grand tableau
        int maxLength = Math.max(array1.length, array2.length);
        int[] sommeTableau = new int[maxLength];

        int valeurParDefaut = 0;
        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < array1.length) ? array1[i] : valeurParDefaut;
            int val2 = (i < array2.length) ? array2[i] : valeurParDefaut;
            sommeTableau[i] = val1 + val2;
        }

        System.out.println("Tableau avec la somme des deux tableaux : " + Arrays.toString(sommeTableau));
    }
}
