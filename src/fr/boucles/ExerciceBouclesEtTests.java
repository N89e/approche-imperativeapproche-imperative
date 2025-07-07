package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // 1. Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Tous les éléments du tableau :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        // 2. Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("Eléments dans l'ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        // 3. Afficher uniquement les entiers supérieurs à 3
        System.out.println("Entiers supérieurs à 3 :");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 3) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        // 4. Afficher uniquement les entiers pairs
        System.out.println("Entiers pairs :");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        // 5. Afficher uniquement les valeurs des index pairs
        System.out.println("Valeurs aux index pairs :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        // 6. Afficher uniquement les entiers impairs
        System.out.println("Entiers impairs :");
        for (int i = array.length - 1; i >= 0; i--) {
            //!=0 est plus robuste que ==1 (car s'il y a des chiffres négatif le ==1 ne prendre pas en compte
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
