package fr.algorithmie;

import java.util.Arrays;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Valeur mini dans le tableau : " + min);
    }
}
