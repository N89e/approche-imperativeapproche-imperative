public class ExerciceBoucleBase {
    public static void main(String[] args) {
        // 1. Afficher tous les nombres de 1 à 10
        System.out.println("Nombres de 1 à 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. Afficher 20 fois nom et prénom
        String nom = "esteves";
        String prenom = "nuno";
        System.out.println("\n20 fois nom et prénom :");
        for (int i = 0; i < 20; i++) {
            System.out.println(nom + " " + prenom);
        }

        // 3. Afficher les éléments pairs de 2 à 100
        System.out.println("\nNombres pairs de 2 à 100 :");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        // 4. Afficher les éléments impairs de 1 à 99
        System.out.println("\nNombres impairs de 1 à 99 :");
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}
