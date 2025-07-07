package fr.algorithmie;

import java.util.Arrays;
/**
 * Créer une classe RechercheSecond
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * Rechercher le second plus grand élément du tableau et affichez le
 * */

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        Arrays.sort(array);
        //Afficher le tableau ordre croissant
        System.out.println(Arrays.toString(array));
        //Affiche le deuxième élément le plus grand
        System.out.println(array[array.length - 2]);
    }
}
