package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        //Afficher l’ensemble des éléments du tableau
        System.out.println("Afficher le contenu du tableau" + '\n');
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("Afficher le 1er tableau dans le sens inverse" + '\n');
        //Afficher l\’ensemble des éléments dans l\’ordre inverse du tableau
        for (int i = array.length -1; i >= 0; i--) {
            System.out.println("index " + i + " = " + array[i]);
        }
        System.out.println("Copie du 1er tableau" + '\n');
        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.stream(arrayCopy).forEach(System.out::println);

    }
}
