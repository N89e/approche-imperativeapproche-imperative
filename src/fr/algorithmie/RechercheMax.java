package fr.algorithmie;

import java.util.Arrays;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Valeur maxi dans le tableau : " + max);
    }
}
