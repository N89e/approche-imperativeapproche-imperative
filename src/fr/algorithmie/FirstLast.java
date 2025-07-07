package fr.algorithmie;

/**
 * •
 * Créer une classe FirstLast
 * Dans cette classe, on déclare un tableau d’entiers
 * On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 *  elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
 *  elle vaut false dans les autres cas
 * écrire l’algo de valorisation de cette variable avec le minimum de ligne
 * */

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {3, 8, 17, 5, 4, 0, 6};
        boolean result = (array.length >= 1) && (array[0] == array[array.length - 1]);
        System.out.println("Résultat : " + result);
    }
}
