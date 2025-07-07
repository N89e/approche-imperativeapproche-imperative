package fr.algorithmie;

import java.util.Arrays;

/**
 * Créer une classe Rotation
 * Dans cette classe, on déclare un tableau d’entiers
 * Effectuez une rotation à droite des éléments.
 * Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
 * */

public class Rotation {
    public static void main(String[] args) {
        int[] array = {3, 8, 17, 5, 4, 0, 6};
        if (array.length > 1) {
            //Ici je récupére le dernier élément
            int last = array[array.length -1];
            //Ici je décale tous les éléments vers la droite
            for (int i = array.length -1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            //Et enfin j'ajoute le dernier élément au début du tableau
            array[0] = last;
        }
        System.out.println("Tableau après rotation : " + Arrays.toString(array));
    }
}
