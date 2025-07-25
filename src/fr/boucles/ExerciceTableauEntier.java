public class ExerciceTableauEntier {
    public static void main(String[] args) {
        // Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Affichez le premier élément du tableau
        System.out.println("Premier élément : " + tableau[0]);

        // Affichez la longueur du tableau en utilisant la propriété length
        System.out.println("Longueur du tableau : " + tableau.length);

        // Affichez le dernier élément du tableau en utilisant la propriété length
        System.out.println("Dernier élément : " + tableau[tableau.length - 1]);

        // Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8
        tableau[4] = 8;
        System.out.println("Nouvelle valeur à l’index 4 : " + tableau[4]);
    }
}
