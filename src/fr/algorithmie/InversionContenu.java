package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Création d'un nouveau tableau de même taille
        int[] arrayCopy = new int[array.length];

        // Remplissage du nouveau tableau dans l'ordre inverse
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        // Affichage du tableau de base
        System.out.println("Tableau de base :");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println('\n');
        // Affichage du tableau inversé
        System.out.println("Tableau inversé :");
        for (int val : arrayCopy) {
            System.out.print(val + " ");
        }
    }
}
