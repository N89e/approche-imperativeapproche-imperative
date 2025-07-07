package fr.algorithmie;
/**
 * •
 * Créer une classe FirstLast6
 * Dans cette classe, on déclare un tableau d’entiers
 * On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 *  elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
 *  elle vaut false dans les autres cas
 * écrire l’algo de valorisation de cette variable avec le minimum de ligne
 * */

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {3, 8, 17, 5, 4, 0, 6};
        boolean result = (array.length > 0) && ((array[0] == 6) || (array[array.length - 1] == 6));
        System.out.println("Résultat : " + result);
    }
}
